package com.lambda.operators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		list=Arrays.asList(10,20,30,40,50);
		UnaryOperator<Integer>unaryOpt=i->i*i;
		calculateSquare(unaryOpt,list).forEach(e->System.out.println(e));
		

	}

	private static List<Integer> calculateSquare(UnaryOperator<Integer> unaryOpt, List<Integer> list) {
		List<Integer>uniList=new ArrayList<>();
		list.forEach(e->uniList.add(unaryOpt.apply(e)));
		return uniList;
		
		
	}

}
