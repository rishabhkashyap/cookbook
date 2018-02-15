package com.lambda.operators;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOpertaorDemo {

	public static void main(String[] args) {
		Map<String,String>shield=new HashMap<>();
		shield.put("1", "Phil");
		shield.put("2", "Melinda");
		shield.put("3", "Gemma");
		shield.put("4", "Leo");
		shield.put("5", "Phil");
		shield.put("6", "Mackenzie");
		shield.put("7", "Ghost rider");
		shield.put("8", "Yo yo");
		
		BinaryOperator<String> binaryOpt =(key,value)->key+" : "+value;
		getAgentList(binaryOpt,shield)
		            .forEach(e->System.out.println(e));;

	}

	private static List<String> getAgentList(BinaryOperator<String> binaryOpt, Map<String, String> shield) {
		List<String>agentList=new ArrayList<>();
		shield.forEach((key,value)->agentList.add(binaryOpt.apply(key, value)));
		return agentList;
		
	}

}
