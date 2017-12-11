package com.lambda.joinners;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JonnerDemo {
	public static void main(String[] args){
		StringJoiner joinner=new StringJoiner(";");
		String combinedString=joinner.add("Apple")
				                     .add("Samsung")
				                     .add("Walmart").toString();
		System.out.println("Combined String = "+combinedString);
		
		//Using join method of String class
		
		combinedString=String.join(",", "Apple","Walmart","Sony","Amazon");
		
		System.out.println("Combined string again = "+combinedString);
		
		String[]comapanies=new String[]{"Flipkart","Rento Mojo","Zoom car","PayTM"};
		combinedString=String.join(",", comapanies);
		
		System.out.println("Combined array = "+combinedString);
		
		List<String>avengers=new ArrayList<>();
		avengers.add("Iron man");
		avengers.add("Thor");
		avengers.add("Black widow");
		avengers.add("Hulk");
		avengers.add("Captain America");
		
		combinedString=avengers.stream()
				               .map(e->e.toUpperCase())
				               .collect(Collectors.joining("<>"));
		System.out.println("Combined Avengers = "+combinedString);
	}
	

}
