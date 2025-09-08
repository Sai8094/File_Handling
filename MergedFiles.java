package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MergedFiles {

	public static void main(String[] args) {
		String[] inputFiles = { "C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\source",
				"C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\input",
				"C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\user_input" };

		try (BufferedWriter writer = new BufferedWriter(new FileWriter(
				"C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\merged_feedback.txt"))) {
			for (String fileName : inputFiles) {
				try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
					String line;
					while ((line = reader.readLine()) != null) {
						writer.write(line);
						writer.newLine();
					}
				}
			}
			System.out.println("Files merged successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
