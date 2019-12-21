package com.cg.fileHandling.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput {
	public static void main(String[] args) {
		try{
			FileInputStream f1 = new FileInputStream("Sai.txt");
			int a = f1.read();
			System.out.println((char)a);
			int j=0;
			while((j=f1.read()) != -1) {
				System.out.println((char)j);
			}
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
