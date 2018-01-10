package com.lambda.groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import  java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<Person>people=new ArrayList<>();
		people.add(new Person("Sherlock","London",40));
		people.add(new Person("Dr Strange","London",35));
		people.add(new Person("Nikita","NYC",30));
		people.add(new Person("Alex","NYC",20));
		people.add(new Person("Bomkesh","Kolkata",55));
		people.add(new Person("Didi","Kolkata",47));
		people.add(new Person("Dimitri","Moscow",42));
		people.add(new Person("Sergei","Serbia",80));
		people.add(new Person("Watson","London",49));
		people.add(new Person("Oliver","Queens",37));
		
		Map<String,List<Person>> peopleByCity=people.stream()
				                                    .collect(Collectors.groupingBy(p->p.getCity()));
		Set<Entry<String, List<Person>>>pplSet=peopleByCity.entrySet();
		pplSet.forEach(e->e.getValue().forEach(element->System.out.println("Name = "+element.getName()+"   "+"City = "+element.getCity())));
		
		Set<Map.Entry<String, Long>> freq=people.stream()
				                    .collect(Collectors.groupingBy(p->p.getCity(),Collectors.counting()))
				                    .entrySet();
				                    //.stream()
//				                    .max(Map.Entry.comparingByValue())
//				                    .map(Map.Entry::getKey());
		
	freq.forEach(e->System.out.println(e.getKey()+"     "+e.getValue()));	
				                    
				                    

	}
	
	static class Person{
		private  String name;
		private String city;
		private int age;
		public Person(String name, String city, int age) {
			super();
			this.name = name;
			this.city = city;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		
		
	}

}
