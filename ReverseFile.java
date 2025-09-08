package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReverseFile {
	
	    public static void main(String[] args) {
	        StringBuilder content = new StringBuilder();

	        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\source"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                content.append(line);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        content.reverse();

	        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\saiav\\BridgeLabWorkSpace\\FileHandling\\src\\resources\\reversed"))) {
	            bw.write(content.toString());
	            System.out.println("File content reversed.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}
