package com.io;

import java.io.*;
import java.util.Scanner;

public class UserInputToFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text to write to file:");

		String input = scanner.nextLine();

		try (FileWriter writer = new FileWriter(
				"C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\user_input")) {
			writer.write(input);
			System.out.println("Input written to file.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
