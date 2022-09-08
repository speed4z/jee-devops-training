package com.training.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo {	
	public static void main(String[] args) {
		Path p1 = Paths.get("src","/d1/d3/d4");
		Path p2 = Paths.get("srcr");
		Path p3 = Paths.get("srcr","/d6");
		
		System.out.println(p1.getFileSystem());
		System.out.println(p1.getParent());
		System.out.println(p1.getRoot());
		System.out.println("============");
		System.out.println(p2.getFileSystem());
		System.out.println(p2.getParent());
		System.out.println(p2.getRoot());
		System.out.println("============");
		System.out.println(p3.getFileSystem());
		System.out.println(p3.getParent());
		System.out.println(p3.getRoot());
		System.out.println("============");
		
		
		try{
			Files.createDirectories(p1);
			System.out.println("Directories created");
			Files.createDirectory(p2);
			System.out.println("Directory created");
			Files.createDirectory(p3);
			System.out.println("Directory created");

		}
		catch(IOException e) {
			System.out.println("Cant create directories "+e.getMessage());
		}
	}
}
