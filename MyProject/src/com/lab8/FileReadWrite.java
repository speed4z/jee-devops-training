package com.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReadWrite {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		try (FileInputStream fis = new FileInputStream("C:\\Users\\shard\\eclipse-workspace\\temp\\test.txt"); 
				FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\shard\\\\eclipse-workspace\\\\temp\\\\out.txt");)
		{	
			int i;
			while((i=fis.read()) !=-1) {
				sb.append((char)i);
			}
			System.out.println("File content: "+sb);
			sb.reverse();
			System.out.println("Reverse: "+sb);
			
			System.out.println("==============Writing in out.txt============");
			for(int j=0;j < sb.length();j++) {
				fos.write((int)sb.charAt(j));
			}
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try(FileOutputStream fos = new FileOutputStream("C:\\Users\\shard\\eclipse-workspace\\temp\\test.txt"); )
		{
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");		
	}
}
