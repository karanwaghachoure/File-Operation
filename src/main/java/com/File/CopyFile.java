package com.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fI = new FileInputStream("account.txt");
		
		FileOutputStream fO = new FileOutputStream("Ram.txt");
		
		int data=0;
		
		while((data=fI.read())!=-1) {
			fO.write((char)data);
		}
		
		System.out.println("copy the file successfully");
		fI.close();
		fO.close();
	}

}
