package com.training.prac;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//copy a b
//cmd prompt - DOS
//copy  src dest 
//copy d:\\mkg\\data.txt  desktop\\newProd.txt
//which file is being opened in input mode for read  -- proddata.txt in d:\\mkg --should exists it is mandatory
//write mode /output  --- newProd.txt  - this file might not exist  ,this file will get created and write on to it
//FileNotFoundException -- handled/declared ,IOException --read /write permission -

public class FileCopyDemo {

	public static void main(String[] args) {
		File file1 =new File("C:\\Users\\shard\\eclipse-workspace\\temp");
		File file2 = new File("C:\\Users\\shard\\eclipse-workspace\\ans.txt");
		//all those classes which have implemented auto closable will be allowed to be declared inside try with resources
		try(FileInputStream fis = new FileInputStream(file1);
			FileOutputStream fos=new FileOutputStream(file2)){
			int i;
			while((i=fis.read()) !=-1) {
				
				fos.write(i);
				System.out.print((char)i);
			}
			System.out.println("wrote to the new file");
			
		} catch (FileNotFoundException e) {
		    System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("lack of system privleges to read or write to the file");
		}
	}
}