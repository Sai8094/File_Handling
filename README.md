# File I/O Problems in Java

This project contains a set of problems and solutions to practice **File I/O operations in Java**, including the use of `FileReader`, `FileWriter`, `BufferedReader`, and `BufferedWriter`.

---

## 📂 Problems with FileReader and FileWriter

### Problem 1: Copy File Content
**Requirements**
1. Read the content from `source.txt`.
2. Write the content to `destination.txt`.

**Approach**
- Use `FileReader` to read from `source.txt`.
- Use `FileWriter` to write to `destination.txt`.
- Handle exceptions and close resources with **try-with-resources**.

---

### Problem 2: Read and Display File Content
**Requirements**
1. Read the content from `input.txt`.
2. Print each line of the file to the console.

**Approach**
- Use `BufferedReader` to read from `input.txt`.
- Use a loop to print each line.
- Handle exceptions and close resources properly.

---

### Problem 3: Write User Input to a File
**Requirements**
1. Read user input from the console.
2. Write the input to `user_input.txt`.

**Approach**
- Use `Scanner` to read input from the user.
- Use `FileWriter` to write to the file.
- Handle exceptions and ensure resource closure.

---

### Problem 4: Count Words in a File
**Requirements**
1. Read the content from `text_file.txt`.
2. Count the number of words.
3. Print the word count.

**Approach**
- Use `BufferedReader` to read the file.
- Split each line into words and count.
- Print the result and handle exceptions.

---

### Problem 5: Reverse File Content
**Requirements**
1. Read content from `input.txt`.
2. Reverse the content.
3. Write to `reversed.txt`.

**Approach**
- Use `BufferedReader` to read the file.
- Use `StringBuilder` to reverse the text.
- Use `BufferedWriter` to write the result.
- Handle exceptions and ensure resources are closed.

---

## 📂 Problems with BufferedReader and BufferedWriter

### Problem 1: Large Data File Processing
**Scenario**  
Process customer transaction records from `transactions.txt` and filter out transactions above a certain amount.

**Approach**
- Use `BufferedReader` to read lines.
- Parse and filter transactions by amount.
- Use `BufferedWriter` to write filtered records to `filtered_transactions.txt`.

---

### Problem 2: Aggregating Report Data
**Scenario**  
Summarize log entries by counting occurrences of each log level from `logs.txt`.

**Approach**
- Use `BufferedReader` to read entries.
- Use `HashMap` to count log levels.
- Write summary to `log_summary.txt` using `BufferedWriter`.

---

### Problem 3: Copying File Contents
**Scenario**  
Copy the contents of `source.txt` to `destination.txt`.

**Approach**
- Use `BufferedReader` to read.
- Use `BufferedWriter` to write efficiently.

---

### Problem 4: Merging Multiple Files
**Scenario**  
Merge customer feedback files (`file1.txt`, `file2.txt`, `file3.txt`) into one file.

**Approach**
- Use `BufferedReader` to read multiple files.
- Use `BufferedWriter` to write combined data to `merged_feedback.txt`.

---
