package com.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileContent {

	public static void main(String[] args) {
		try (FileReader reader = new FileReader("C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\source"); 
			FileWriter writer = new FileWriter("C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\destination")) {

			int ch;
			while ((ch = reader.read()) != -1) {
				writer.write(ch);
			}

			System.out.println("File copied successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
