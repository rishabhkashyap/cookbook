package com.lambda.model;

public class Employee {
	
	private int id;
	private String firstname;
	private String lastname;
	private int salary;
	
	public Employee(int id,String firstname, String lastname, int salary) {
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.salary = salary;
	}
	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		
		return this.id+" "+ this.firstname+" "+lastname+": "+salary;
	}
	
	
	
	
	

}
