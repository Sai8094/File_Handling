package com.jsontask;

import java.util.Scanner;

import com.jsontask.Task;
import com.jsontask.TaskManager;

public class TaskApp {
	public static void main(String[] args) throws Exception {
		TaskManager manager = new TaskManager();
		Scanner sc = new Scanner(System.in);
		Task task;
		while (true) {
			System.out.println("--- Task Management System ---");
			System.out.println("1. Add Task");
			System.out.println("2. View All Tasks");
			System.out.println("3. Update Task");
			System.out.println("4. Delete Task");
			System.out.println("5. Mark Task Completed");
			System.out.println("6. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				task =  new Task();
				System.out.print("Enter Task ID: ");
				task.setTaskId(sc.nextInt());
				sc.nextLine(); 
				System.out.print("Enter Description: ");
				task.setDescription(sc.nextLine());
				System.out.print("Enter Due Date: ");
				task.setDueDate(sc.nextLine());
				task.setStatus(false);
				manager.addTask(task);
				break;

			case 2:
				manager.viewTasks();
				break;

			case 3:
				System.out.print("Enter Task ID: ");
				int updateId = sc.nextInt();
				sc.nextLine();
				System.out.print("New Description: ");
				String newDesc = sc.nextLine();
				System.out.print("New Due Date: ");
				String newDue = sc.nextLine();
				manager.updateTask(updateId, newDesc, newDue);
				break;

			case 4:
				System.out.print("Enter Task ID to delete: ");
				int deleteId = sc.nextInt();
				manager.deleteTask(deleteId);
				break;

			case 5:
				System.out.print("Enter Task ID to mark completed: ");
				int completeId = sc.nextInt();
				manager.markCompleted(completeId);
				break;

			case 6:
				System.out.println("Exiting...");
				return;

			default:
				System.out.println("Invalid choice. Try again.");
			}
		}
	}
}
