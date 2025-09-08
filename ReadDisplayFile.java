package com.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadDisplayFile {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\source"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
