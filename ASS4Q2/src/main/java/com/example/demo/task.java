package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String task;
	private String category;
	private String duedate;
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	@Override
	public String toString() {
		return "task [task=" + task + ", category=" + category + ", duedate=" + duedate + "]";
	}
	
	

}
