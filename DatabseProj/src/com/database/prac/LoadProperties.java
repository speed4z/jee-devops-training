package com.database.prac;

import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Properties;

public class LoadProperties {
	public static void main(String[] args) {
		
		Properties props = new Properties();
		Path p1 = Paths.get("src","db.properties");
		
		try(final FileChannel channel =
				FileChannel.open(p1, StandardOpenOption.READ)){
			
			props.load(Channels.newInputStream(channel));
			String urlVal = props.getProperty("url");
			String usernameVal = props.getProperty("username");
			String passwordVal = props.getProperty("password");
			
			System.out.println(urlVal);
			System.out.println(usernameVal);
			System.out.println(passwordVal);			
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}	
}
