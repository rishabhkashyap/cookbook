package com.lambda.reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {

	public static void main(String[] args) {
		List<Employee> employeeList = Arrays.asList(new Employee("Tom Jones", 45, 7000.00),
				new Employee("Harry Major", 25, 10000.00), new Employee("Ethan Hardy", 65, 8000.00),
				new Employee("Nancy Smith", 22, 12000.00), new Employee("Deborah Sprightly", 29, 9000.00));
		//Max salary
		Optional<Employee> maxSalEmp=employeeList.stream()
				                                 .reduce((Employee a,Employee b)->a.getSalary()>b.getSalary()?a:b);
		if(maxSalEmp.isPresent()) {
			System.out.println("Max salary = "+maxSalEmp.get().toString());
		}
		
		//Salary sum
		Optional<Double>salarySum=employeeList.stream()
                                              .map(emp->emp.getSalary())
                                              .reduce(Double::sum);
		if(salarySum.isPresent()) {
			System.out.println("Sum of salary = "+salarySum.get());
		}
	}

	public static class Employee {
		private String name;
		private Integer age;
		private Double salary;

		public Employee(String name, Integer age, Double salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public Double getSalary() {
			return salary;
		}

		public void setSalary(Double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}

	}

}
