package com.jsontask;

public class Task {
	private int taskId;
	private String description;
	private String dueDate;
	private boolean status;
	
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", description=" + description + ", dueDate=" + dueDate + ", status=" + status
				+ "]";
	}
	
	

} 
