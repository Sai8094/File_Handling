package com.jsonemployee;

import com.jsonemployee.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	private static final String FILE_NAME = "employees.json";
	private ObjectMapper mapper = new ObjectMapper();

	// Load employees
	private List<Employee> loadEmployees() throws IOException {
		File file = new File(FILE_NAME);
		if (!file.exists() || file.length() == 0) {
			mapper.writerWithDefaultPrettyPrinter().writeValue(file, new ArrayList<Employee>());
			return new ArrayList<>();
		}
		Employee[] empArray = mapper.readValue(file, Employee[].class);
		List<Employee> employees = new ArrayList<>();
		for (Employee e : empArray) {
			employees.add(e);
		}
		return employees;
	}

	// Save employees
	private void saveEmployees(List<Employee> employees) throws IOException {
		mapper.writerWithDefaultPrettyPrinter().writeValue(new File(FILE_NAME), employees);
	}

	// Add employee
	public void addEmployee(Employee emp) throws IOException {
		List<Employee> employees = loadEmployees();
		for (Employee e : employees) {
			if (e.getEmployeeId() == emp.getEmployeeId()) {
				System.out.println("Employee ID already exists!");
				return;
			}
		}
		employees.add(emp);
		saveEmployees(employees);
		System.out.println("Employee added successfully!");
	}

	// View employees
	public void viewEmployees() throws IOException {
		List<Employee> employees = loadEmployees();
		for (Employee e : employees) {
			System.out.println(e);
		}
	}

	// Update employee
	public void updateEmployee(Employee updated) throws IOException {
		List<Employee> employees = loadEmployees();
		for (Employee e : employees) {
			if (e.getEmployeeId() == updated.getEmployeeId()) {
				e.setEmployeeName(updated.getEmployeeName());
				e.setDepartment(updated.getDepartment());
				e.setAddress(updated.getAddress());
				e.setProjectList(updated.getProjectList());
			}
		}
		saveEmployees(employees);
		System.out.println("Employee updated!");
	}

	// Delete employee
	public void deleteEmployee(int id) throws IOException {
		List<Employee> employees = loadEmployees();
		employees.removeIf(e -> e.getEmployeeId() == id);
		saveEmployees(employees);
		System.out.println("Employee deleted!");
	}

	// Search employee
	public void searchEmployee(int id) throws IOException {
		List<Employee> employees = loadEmployees();
		for (Employee e : employees) {
			if (e.getEmployeeId() == id) {
				System.out.println(e);
				return;
			}
		}
		System.out.println("Employee not found!");
	}
}
