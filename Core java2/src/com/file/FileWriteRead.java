package com.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteRead {
	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("tops2.txt");
		String s="This is file Writer/reader example using Java";
		fw.write(s);
		fw.flush();
		fw.close();
		
		
		FileReader fr=new FileReader("tops2.txt");
		int i;
		while ((i=fr.read())!=-1)
		{
			System.out.print((char)i);
		}
		fr.close();
	}

}
