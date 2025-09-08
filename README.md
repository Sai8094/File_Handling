# Task & Employee Management Systems  

This repository contains two JSON-based management systems:  
1. **Task Management System**  
2. **Employee Management System**  

Both systems use a **menu-driven interface** to manage data stored in JSON files.  

---

## 📌 Task Management System  

### Problem Statement  
A simple system to manage tasks with attributes:  
- **TaskID** (int, unique)  
- **Description** (String)  
- **DueDate** (String)  
- **Completed** (boolean)  

### Functional Requirements  
1. **Add a New Task**  
   - Prompt the user for task details and store them in a JSON file.  
   - Ensure Task ID is unique.  
2. **View All Tasks**  
   - Display all stored tasks.  
3. **Update Task Details**  
   - Update description and due date of a task by Task ID.  
4. **Delete a Task**  
   - Remove a task from the JSON file using Task ID.  
5. **Mark Task as Completed**  
   - Mark a specific task as completed.  
6. **Menu-Driven Interface**  
   - User-friendly menu for operations.  

---

## 📌 Employee Management System  

### Problem Statement  
A system to manage employee details and their projects.  

Each employee has:  
- **Employee ID** (int, unique)  
- **Name** (String)  
- **Department** (String)  
- **Address** (nested object: street, city, zipcode)  
- **Projects** (list of objects: projectId, projectName, status)  

### Functional Requirements  
1. **Add a New Employee**  
   - Enter employee details, including address and projects.  
   - Ensure Employee ID is unique.  
2. **View All Employees**  
   - Display all employee details from JSON file.  
3. **Update Employee Details**  
   - Update name, department, address, and projects.  
4. **Delete an Employee**  
   - Remove an employee by ID.  
5. **Search for an Employee**  
   - Find and display details by Employee ID.  
6. **Menu-Driven Interface**  
   - Easy-to-use interactive menu.  

---
  }
]
