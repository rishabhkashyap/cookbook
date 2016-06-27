//Stock based implementation of stock span gives better implementation
//it has running time of o(n)

package com.cookbook.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackSpanBetter {

	public static void main(String[] args) {
		List<Integer>stock=new ArrayList<>();
		stock.add(100);
		stock.add(60);
		stock.add(70);
		stock.add(65);
		stock.add(80);
		stock.add(85);
		List<Integer>stockSpan=new ArrayList<>();
		stockSpan.add(0,1);
		Stack<Integer> span=new Stack<>();
		span.push(0);
		
		for(int i=1;i<stock.size();i++){
			while((!span.empty())&&(stock.get(span.peek())<stock.get(i))){
				span.pop();
			}
			stockSpan.add(i,i-span.peek());
			span.push(i);
		}
		System.out.println(stockSpan);
		

	}


}
