package com.cookbook.stack;

//The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and
//we need to calculate span of stock’s price for all n days. The span Si of the stock’s price on a given day i
//is defined as the maximum number of consecutive days just before the given day, for which the price of the stock
//on the current day is less than or equal to its price on the given day.
//For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85},
//then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}


public class StockSpan {
	
	public static void main(String[] args){
		
		//int []arr={100, 80, 60, 70, 60, 75, 85};
		int[] arr ={100, 60,70,65, 80, 85};
		int[] span=new int[7];
		span[0]=1;
		int spanVal=0;
		int otherDay=0;
		for(int i=1;i<arr.length;i++){
			otherDay=i-1;
			spanVal=1;
			while(otherDay!=0){
				if (arr[otherDay]<=arr[i]){
					++spanVal;
				}else{
					break;
				}
				otherDay--;
			}
			span[i]=spanVal;
		}
	
		System.out.println("Span : ");
		for(int i=0;i<span.length;i++){
			System.out.print(span[i]+"\t");
		}
	}

}
