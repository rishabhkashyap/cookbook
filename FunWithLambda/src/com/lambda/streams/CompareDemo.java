package com.lambda.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.lambda.model.Employee;

public class CompareDemo {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();

		Employee emp1 = new Employee(101,"Mark", "Q", 10000);
		Employee emp2 = new Employee(102,"Steven", "Roy", 5000);
		Employee emp3 = new Employee(103,"Maggie", "Q", 20000);
		Employee emp4 = new Employee(104,"Kalley", "Cucao", 30000);
		Employee emp5 = new Employee(105,"Simen", "Helberg", 5000);
		Employee emp6 = new Employee(106,"Charlie", "Sheen", 1000);
		Employee emp7 = new Employee(107,"Carry", "Fisher", 38000);
		Employee emp8 = new Employee(108,"Abigel", "Chase", 45000);
		Employee emp9 = new Employee(109,"Anthony", "Mark", 4500);
		Employee emp10 = new Employee(110,"Sharman", "Joshi", 500);

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		employees.add(emp6);
		employees.add(emp7);
		employees.add(emp8);
		employees.add(emp9);
		employees.add(emp10);
		
		Comparator<Employee> comparator=Comparator.comparing(emp->emp.getSalary());
		
		//Comparator<Employee>reverseComparator=Comparator.reverseOrder();
		System.out.println("Employee list in natural order based on salary");
		employees.sort(Comparator.comparing(emp->emp.getSalary()));
		employees.forEach(emp->System.out.println(emp.toString()));
		
		System.out.println("\nEmployee list in reverse order based on salary\n");
		employees.sort(comparator.reversed());
		employees.forEach(emp->System.out.println(emp.toString()));

	}

}
