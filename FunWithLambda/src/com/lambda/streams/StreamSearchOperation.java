package com.lambda.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSearchOperation {

	public static void main(String[] args) {
		List<Integer>evenNumber=new ArrayList<>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		evenNumber.add(12);
		evenNumber.add(10);
		boolean isListEven=evenNumber.stream()
					                 .allMatch(num->num%2==0);
		System.out.println("Is list even= ="+isListEven);
		//evenNumber.clear();
		
		List<Integer>numbers=evenNumber.stream()
							.map(num->num+1)
							.collect(Collectors.toList());
		System.out.println();
		numbers.forEach(num->System.out.print(num+"\t"));
		numbers.add(15);
		boolean evenNumExist=numbers.stream()
				                    .anyMatch(num->num%2==0);
		
		System.out.println("\n Does list contain any even number = "+evenNumExist);
		
				            
		

	}

}
