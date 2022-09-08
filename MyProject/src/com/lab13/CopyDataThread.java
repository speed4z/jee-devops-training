package com.lab13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyDataThread extends Thread{

	private String f,g;
	public CopyDataThread(String f,String g)
	{
		this.f=f;
		this.g=g;
	}
	@Override
	public void run()
	{
		try(FileInputStream fr=new FileInputStream(f);
				FileOutputStream fo=new FileOutputStream(g);	)
		{
			int i;
		    StringBuilder s=new StringBuilder();
		    while((i=fr.read())!=-1) {
		    	fo.write(i);
		    	s.append((char)i);
		    	if(s.length()==10)
		    	{
		    		System.out.println(s);
		    		Thread.sleep(5000);
		    		System.out.println("Next 10:");
		    		s.delete(0, s.length());
		    	}
		    }
		    System.out.println("Wrote into new file");
			} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
