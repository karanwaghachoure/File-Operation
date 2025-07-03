package com.File;
import java.io.FileOutputStream;

public class File2 {
	public static void main(String[] args) throws Exception {
		String str= "rahul is good person they will cleaver";
		 byte[] s = str.getBytes();
		FileOutputStream fs =new FileOutputStream("account.txt");
		fs.write(s);
		System.out.println("Print the message successfully...");
		fs.close();
	}

}
