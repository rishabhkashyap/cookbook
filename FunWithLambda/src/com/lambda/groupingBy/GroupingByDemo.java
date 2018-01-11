package com.lambda.groupingBy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupingByDemo {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Sherlock", "London", 40, "male"));
		people.add(new Person("Dr Strange", "London", 35, "male"));
		people.add(new Person("Nikita", "NYC", 30, "female"));
		people.add(new Person("Alex", "NYC", 20, "female"));
		people.add(new Person("Bomkesh", "Kolkata", 55, "male"));
		people.add(new Person("Didi", "Kolkata", 47, "female"));
		people.add(new Person("Dimitri", "Moscow", 42, "male"));
		people.add(new Person("Sergei", "Serbia", 80, "male"));
		people.add(new Person("Watson", "London", 49, "male"));
		people.add(new Person("Oliver", "Queens", 37, "male"));

		// Group by people by city
		Map<String, List<Person>> peopleByCity = people.stream().collect(Collectors.groupingBy(p -> p.getCity()));
		Set<Entry<String, List<Person>>> pplSet = peopleByCity.entrySet();
		System.out.println("Group people by city \n");
		pplSet.forEach(e->System.out.println(e.getKey()+"  "+e.getValue()));

		// getting count of people in each city
		Set<Map.Entry<String, Long>> freq = people.stream()
				.collect(Collectors.groupingBy(p -> p.getCity(), Collectors.counting())).entrySet();
		// .stream()
		// .max(Map.Entry.comparingByValue())
		// .map(Map.Entry::getKey());

		freq.forEach(e -> System.out.println(e.getKey() + "     " + e.getValue()));

		// group people by sex
		Set<Entry<String, List<Person>>> pplGroupBySet = people.stream()
				.collect(Collectors.groupingBy(ppl -> ppl.getSex())).entrySet();
        System.out.println("Group by sex \n");
        pplGroupBySet.forEach(ppl-> System.out.println(ppl.getKey()+"  "+ ppl.getValue()));
        
        //Getting max age people
        Set<Entry<String,Optional<Person>>> maxAgePpl=people.stream()
        		                                     .collect(Collectors.groupingBy(ppl->ppl.getSex(),Collectors.maxBy(Comparator.comparing(ppl->ppl.getAge()))))
        		                                     .entrySet();
        maxAgePpl.forEach(e -> System.out.println(e.getKey() + "     " + e.getValue().get().getName()));
        
	}

	static class Person {
		private String name;
		private String city;
		private int age;
		private String sex;

		public Person(String name, String city, int age, String sex) {
			super();
			this.name = name;
			this.city = city;
			this.age = age;
			this.sex = sex;
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

		public String getSex() {
			return sex;
		}

		public void setSex(String sex) {
			this.sex = sex;
		}
		
		public String toString() {
			return name;
		}

	}

}
