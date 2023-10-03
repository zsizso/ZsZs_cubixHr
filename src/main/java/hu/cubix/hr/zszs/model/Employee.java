package hu.cubix.hr.zszs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Employee {
	private int id;
	private int salary;
	private LocalDate startWork;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public LocalDate getStartWork() {
		return startWork;
	}
	public void setStartWork(LocalDate startWork) {
		this.startWork = startWork;
	}
	
	
	

}
