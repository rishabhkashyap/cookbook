package com.lambda.reduce;

import java.util.Arrays;

public class MoreReduce {

	public static void main(String[] args) {
		  int[] array = {23,43,56,97,32};
		  
		  //Add all elements and print result
		  Arrays.stream(array).reduce(((x,y)->x+y)).ifPresent(e->System.out.println("Sum = "+e));
		  
		  //Add number using Integer's sum function
		  Arrays.stream(array).reduce(Integer::sum).ifPresent(e->System.out.println("Sum calculated through integer's sum method = "+e));
		  
		  //Adding 100 to sum of all elements		  
		  int sumPlus100=Arrays.stream(array).reduce(100,(x,y)->x+y);
		  System.out.println("Sum plus 100 = "+sumPlus100);
		  sumPlus100=Arrays.stream(array).reduce(100, Integer::sum);
		  System.out.println("Sum calculated through integer's sum method = "+sumPlus100);
		  
		  //Calculating max element
		  Arrays.stream(array).reduce((x,y)->x>y?x:y).ifPresent(ele->System.out.println("Max element = "+ele));
		  
		  //Calculate using max()
		  int maxElement=Arrays.stream(array).reduce(0,Integer::max);
		  System.out.println("Max element through max method = "+maxElement);
		  
                               
	}

}
