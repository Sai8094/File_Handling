package com.jsonemployee;

import java.util.*;

public class EmployeeApp {
	public static void main(String[] args) throws Exception {
		EmployeeManager manager = new EmployeeManager();
		Scanner sc = new Scanner(System.in);
		Employee employee;
		Address address;
		Project project;
		int employeeId;

		while (true) {
			System.out.println("--- Employee Management System ---");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employees");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. Search Employee");
			System.out.println("6. Exit");
			System.out.print("Choice: ");

			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				employee = new Employee();
				System.out.print("Employee ID: ");
				employee.setEmployeeId(sc.nextInt());
				sc.nextLine();
				System.out.print("Name: ");
				employee.setEmployeeName(sc.nextLine());
				System.out.print("Department: ");
				employee.setDepartment(sc.nextLine());

				// Address
				address = new Address();
				System.out.print("Address: ");
				address.setAddress(sc.nextLine());
				System.out.print("City: ");
				address.setCity(sc.nextLine());
				System.out.print("Zip Code: ");
				address.setZipcode(sc.nextLine());
				employee.setAddress(address);

				// Projects ()
				List<Project> projects = new ArrayList<>();
				project = new Project();
				System.out.print("Project ID: ");
				project.setProjectId(sc.nextInt());
				sc.nextLine();
				System.out.print("Project Name: ");
				project.setProjectName(sc.nextLine());
				project.setStatus("In Progress");
				projects.add(project);
				employee.setProjectList(projects);
				manager.addEmployee(employee);
				break;

			case 2:
				manager.viewEmployees();
				break;
			case 3:
				employee = new Employee();
				System.out.print("Employee ID to update: ");
				employee.setEmployeeId(sc.nextInt());
				sc.nextLine();
				System.out.print("New Name: ");
				employee.setEmployeeName(sc.nextLine());
				System.out.print("New Department: ");
				employee.setDepartment(sc.nextLine());

				address = new Address();
				System.out.print("New Address: ");
				address.setAddress(sc.nextLine());
				System.out.print("New City: ");
				address.setCity(sc.nextLine());
				System.out.print("New Zip Code: ");
				address.setZipcode(sc.nextLine());
				employee.setAddress(address);

				employee.setProjectList(new ArrayList<>());
				manager.updateEmployee(employee);
				break;
			case 4:
				System.out.print("Employee ID to delete: ");
				employeeId = sc.nextInt();
				manager.deleteEmployee(employeeId);
				break;
			case 5:
				System.out.print("Employee ID to search: ");
				employeeId = sc.nextInt();
				manager.searchEmployee(employeeId);
				break;
			case 6:
				System.out.println("Exiting...");
				return;
			default:
				System.out.println("Invalid choice!");
				break;
			}
		}
	}
}
