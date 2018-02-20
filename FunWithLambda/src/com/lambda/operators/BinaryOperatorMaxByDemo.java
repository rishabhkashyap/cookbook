package com.lambda.operators;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class BinaryOperatorMaxByDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student("Shyam", 22,"7");
        Student s2 = new Student("Ram",23,"7");
        Student s3 = new Student("Mohan",22,"8");
        Student s4 = new Student("Ramesh",21,"8");
        List<Student> list = Arrays.asList(s1,s2,s3,s4);
        
        Comparator<Student>comparator=Comparator.comparing(stu->stu.getAge());
        Map<String,Optional<Student>> ageData=new HashMap<>();
        ageData=list.stream()
        		     .collect(Collectors.groupingBy(stu->stu.getClassName(),
        		    		 Collectors.reducing(BinaryOperator.maxBy(comparator))));
        System.out.println("Max age");
        ageData.forEach((className,student)->System.out.println("Class name = "+className+" :"+student.get().toString()));
        
      
        ageData=list.stream()
	     .collect(Collectors.groupingBy(stu->stu.getClassName(),
	    		 Collectors.reducing(BinaryOperator.minBy(comparator))));
        
        System.out.println("Min age");
        ageData.forEach((className,student)->System.out.println("Class name = "+className+" :"+student.get().toString()));
        
        

        

	}
	
	
	 static  class Student {
	    private String name;
	    private Integer age;
	    private String className;
	    public Student(String name,Integer age, String className){
	        this.name=name;
	        this.age=age;
	        this.className = className;
	    }
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getClassName() {
			return className;
		}
		public void setClassName(String className) {
			this.className = className;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
	    
		
	}

}
