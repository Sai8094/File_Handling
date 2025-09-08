# 📑 CSV File Reader & Writer in Java  

## 📌 Problem Statement  
Develop a **Java application** to read and write data from/to a CSV file. The application should:  
- Read structured data from a CSV file (e.g., employee or student records).  
- Process the data (optional: filtering, counting, transformation).  
- Write the processed or new data back into another CSV file.  

---

## 🚀 Requirements  

1. **Read Data from CSV**  
   - Use `BufferedReader` or an external library (e.g., OpenCSV).  
   - Parse rows by splitting values with commas (`,`) or by using a CSV parser.  

2. **Write Data to CSV**  
   - Use `FileWriter` or a library like OpenCSV.  
   - Write headers (if needed) and rows of data.  

3. **Exception Handling**  
   - Apply `try-with-resources` to ensure file streams are closed properly.  

4. **Object-Oriented Concepts**  
   - Represent each record as a class (e.g., `Employee` or `Student`).  
   - Encapsulation: keep fields private and expose getters/setters.  
   - Abstraction: separate file operations into a manager/helper class.  

---

## 🏗️ Example: Employee CSV  

### 📂 Input File → `employees.csv`  
```csv
EmployeeID,Name,Department,Salary
101,Rajeev Shukla,Engineering,50000
102,Richa Ghosh,HR,45000
103,Allu Arjun,Marketing,60000
