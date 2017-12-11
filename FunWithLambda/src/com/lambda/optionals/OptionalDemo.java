package com.lambda.optionals;

import java.util.Optional;

import com.lambda.model.Employee;

public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1=new Employee(101,"Mark","Q",10000);
		Employee emp2=null;
		Optional<Employee>optional=Optional.of(emp1);
		optional.ifPresent(consumer->System.out.println(consumer.toString()));
		
		optional=Optional.ofNullable(emp2);
		optional.ifPresent(consumer->System.out.println(consumer.toString()));
		

	}

}
