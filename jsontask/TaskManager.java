package com.jsontask;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TaskManager {

	private static final String FILE_NAME = "tasks.json";
	private final ObjectMapper mapper = new ObjectMapper();

	private List<Task> loadTasks() throws IOException {
	    File file = new File(FILE_NAME);
	    if (!file.exists() || file.length() == 0) {  
	        return new ArrayList<>();
	    }

	    Task[] taskArray = mapper.readValue(file, Task[].class);
	    List<Task> tasks = new ArrayList<>();
	    for (Task t : taskArray) {
	        tasks.add(t);
	    }
	    return tasks;
	}


	public void saveTasks(List<Task> tasks) throws IOException {
		mapper.writeValue(new File(FILE_NAME), tasks);
	}

	//Add new Task
	public void addTask(Task task) throws IOException {
		List<Task> tasks = loadTasks();
		for (Task t : tasks) {
			if (t.getTaskId() == task.getTaskId()) {
				System.out.println("Task ID already exists!");
				return;
			}
		}
		tasks.add(task);
		saveTasks(tasks);
		System.out.println("Task added!");
	}

	// View all tasks
	public void viewTasks() throws IOException {
		List<Task> tasks = loadTasks();
		if (tasks.isEmpty()) {
			System.out.println("No tasks found.");
		} else {
			for (Task t : tasks) {
				System.out.println(t);
			}
		}
	}

	// Update task
	public void updateTask(int id, String newDesc, String newDueDate) throws IOException {
		List<Task> tasks = loadTasks();
		boolean found = false;
		for (Task t : tasks) {
			if (t.getTaskId() == id) {
				t.setDescription(newDesc);
				t.setDueDate(newDueDate);
				found = true;
				break;
			}
		}
		if (found) {
			saveTasks(tasks);
			System.out.println("Task updated!");
		} else {
			System.out.println("Task not found!");
		}
	}

	// Delete task
	public void deleteTask(int id) throws IOException {
		List<Task> tasks = loadTasks();
		boolean removed = false;
		for (int i = 0; i < tasks.size(); i++) {
			if (tasks.get(i).getTaskId() == id) {
				tasks.remove(i);
				removed = true;
				break;
			}
		}
		if (removed) {
			saveTasks(tasks);
			System.out.println("Task deleted!");
		} else {
			System.out.println("Task not found!");
		}
	}

	// Mark completed
	public void markCompleted(int id) throws IOException {
		List<Task> tasks = loadTasks();
		boolean found = false;
		for (Task t : tasks) {
			if (t.getTaskId() == id) {
				t.setStatus(true);
				found = true;
				break;
			}
		}
		if (found) {
			saveTasks(tasks);
			System.out.println("Task marked as completed!");
		} else {
			System.out.println("Task not found!");
		}
	}
}
