package com.File;

import java.io.FileInputStream;

public class File3 {
	public static void main(String[] args)  throws Exception{
		FileInputStream fs = new FileInputStream("Ram.txt");
		System.out.println(fs);
		fs.close();
	}

}
