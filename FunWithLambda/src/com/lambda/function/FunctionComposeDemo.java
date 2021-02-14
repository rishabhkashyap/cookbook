package com.lambda.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionComposeDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mike Ross", 30));
        employees.add(new Employee("Harvey Specter", 45));
        employees.add(new Employee("Dona Paulson", 40));
        employees.add(new Employee("Rachel Zane", 35));
        Function<Employee, String> firstName = (e) -> getFirstName(e);
        Function<String,Character> firstLetterOfName=(e)->e.charAt(0);
        for (Employee employee:employees){
            System.out.println(firstLetterOfName.compose(firstName).apply(employee));
        }
    }
    private static String getFirstName(Employee employee) {
        return employee.getName().split(" ")[0];
    }
}
