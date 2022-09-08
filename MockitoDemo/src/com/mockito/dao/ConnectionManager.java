package com.mockito.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {
	private static Connection connection;
	
	//this constructor is private
	//this constructor does nothing
	private ConnectionManager()
	{
		
	}
	//static method getConnection() --returns back obj of Connection
	public static Connection getConnection()
	{
		Properties props =  new Properties();
		
		if (connection==null)
		{
			try {
				Path p1 = Paths.get("src","db.properties");
				try(final FileChannel channel = FileChannel.open(p1, StandardOpenOption.READ);
				    	) {

				    props.load(Channels.newInputStream(channel));
				}
							
					String url = (String)props.get("url");
				String username = (String)props.get("username");
				String password = (String)props.get("password");
				//to instantiate the connection object ,we have to invoke DriverManager's class 's
				//static method getConnection(which takes 3 args --- url ,username,password)
	connection=DriverManager.
			getConnection(url,username,password);
				
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return connection;
		
	}
public static void main(String[] args) {
System.out.println(getConnection());
}	
}