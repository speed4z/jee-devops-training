package com.lab10.loadProperties;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.Map.Entry;

public class LoadProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props=new Properties();
		Path p1=Paths.get("src","PersonProps.properties");
		try(final FileChannel channel=FileChannel.open(p1, StandardOpenOption.READ)){
			props.load(Channels.newInputStream(channel));
			
		
			String personage=props.getProperty("age");
			String personphoneno=props.getProperty("phoneNo");
			String personName=props.getProperty("name");
			String persondesignation=props.getProperty("designation");
			
			props.list(System.out);
			
			System.out.println("---------------------");
			
			Set set=props.entrySet();
			Iterator iterator=set.iterator();
			while(iterator.hasNext()) {
				Map.Entry<String,String> entry= (Entry<String, String>) iterator.next();
				System.out.println(entry.getKey()+" : "+entry.getValue());
				
			}
			
			System.out.println("---------------------");
			Properties prop2=new Properties();
			
			prop2.store(new FileWriter("C:\\Users\\shard\\Desktop\\App.properties"), "jdbc url");
			System.out.println("Data url written onto app props");
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}