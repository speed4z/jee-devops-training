package com.lab8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NumberRead {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		try (FileInputStream fis = new FileInputStream("C:\\Users\\shard\\eclipse-workspace\\temp\\numbers.txt"); )
		{	
			int content;
			while((content = fis.read())!=-1) {
				sb.append((char)content);
			}
			System.out.println("Content of numbers.txt: "+sb);
			String array = sb.toString();
			List <Integer> list = new ArrayList<>();
			String []arr1 = array.split(",");
			for(int i=0; i<arr1.length;i++) {
				list.add(Integer.parseInt(arr1[i]));
			}
			System.out.println();
			System.out.println("Even numbers from numbers.txt");
			for(int a:list) {
				if(a%2==0) {
					System.out.println(a);
				}
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
		
	}

}
