package com.lab13;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new CopyDataThread("C:\\Users\\shard\\Desktop\\source.txt","C:\\Users\\shard\\Desktop\\target.txt");
		t1.start();
	}

}
