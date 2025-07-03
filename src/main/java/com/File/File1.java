package com.File;

import java.io.FileInputStream;

public class File1 {
	public static void main(String[] args) throws Exception {
		
		FileInputStream fs = new FileInputStream("account.txt");
		
		 int data=0;		
		 for(;(data=fs.read())!=-1;data++) {
			System.out.println((char)data);
		 }
		 
		 fs.close();
	}

}
