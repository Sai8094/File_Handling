package com.io;

import java.io.*;

public class WordCount {

	public static void main(String[] args) {
		int wordCount = 0;

		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\source"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] words = line.trim().split("\\s+");
				wordCount += words.length;
			}
			System.out.println("Total word count: " + wordCount);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
