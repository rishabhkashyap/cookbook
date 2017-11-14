package com.lambda.streams;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.lambda.model.Employee;

public class FindMethodsDemo {

	public static void main(String[] args) {
		//List<Employee>employees=new ArrayList<>();
		Set<Employee>employees=new HashSet<>();
		Employee emp1=new Employee("Mark","Q",10000);
		Employee emp2=new Employee("Steven","Roy",5000);
		Employee emp3=new Employee("Maggie","Q",20000);
		Employee emp4=new Employee("Kalley","Cucao",30000);
		Employee emp5=new Employee("Simen","Helberg",5000);
		Employee emp6=new Employee("Charlie","Sheen",1000);
		Employee emp7=new Employee("Carry","Fisher",38000);
		Employee emp8=new Employee("Abigel","Chase",45000);
		Employee emp9=new Employee("Anthony","Mark",4500);
		Employee emp10=new Employee("Sharman","Joshi",500);
		
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
        
		Optional<Employee>emp=employees.stream()
										.filter(e->e.getSalary()>10000)			
				                       .findAny();
		if(emp.isPresent()){
			System.out.println(emp.get().toString());
		}
		

	}

}
