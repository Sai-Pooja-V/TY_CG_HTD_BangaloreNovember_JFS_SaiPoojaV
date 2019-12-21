package com.cg.fileHandling.file;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutput {
	public static void main(String[] args) {
		try {
			FileOutputStream f1 = new FileOutputStream("Sai.txt");
			String s1 = "Sai Pooja";
			byte[] b1 = s1.getBytes();
			f1.write(b1);
			System.out.println("Success....");
		}catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
