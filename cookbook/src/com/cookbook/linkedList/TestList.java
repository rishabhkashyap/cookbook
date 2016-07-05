package com.cookbook.linkedList;

public class TestList {

	public static void main(String[] args) {
		List list=new List();
		Node next;
		Node n1=new Node(1);
		Node n2=new Node(2);
		Node n3=new Node(2);
		Node n4=new Node(1);
		Node n5=new Node(5);
		list.add(n1);
		list.add(n2);
		list.add(n3);
		list.add(n4);
		//list.add(n5);
		list.display();
		Node fastPtr=list.getHead();
		Node slowPtr=list.getHead();
		while(fastPtr!=null && fastPtr.next!=null){
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
		}
		//System.out.println("Fast ptr = "+fastPtr.value);
		System.out.println("slow ptr = "+slowPtr.value);

		next=null;
		Node revHead=null;
		Node current=slowPtr;
		while (current!=null){
			next=current.next;
			current.next=revHead;
			revHead=current;
			current=next;
			System.out.println("val = "+revHead.value);
			
			
			
		}
		slowPtr=revHead;
		System.out.println();
		list.display();
		
		

	}

}
