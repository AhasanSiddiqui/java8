package com.ahasan.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.ahasan.java8.beans.Employee;

public class TestEmployeeSorting {
	public static void main(String[] args) {
		List<Employee>  employees=getEmployees();
		
		System.out.println("Before Sorting by id : ");
		traverseEmployee(employees);
		Collections.sort(employees,(obj1, obj2)-> obj1.getId() - obj2.getId());
		System.out.println("After Sorting id : ");
		traverseEmployee(employees);
		
		System.out.println("Before Sorting by Name : ");
		traverseEmployee(employees);
		Collections.sort(employees,(obj1,obj2)->obj1.getName().compareTo(obj2.getName()));
		System.out.println("After Sorting Name : ");
		traverseEmployee(employees);
		
		System.out.println("Before Sorting by Salary : ");
		traverseEmployee(employees);
		Collections.sort(employees,(obj1,obj2)->Integer.parseInt(obj1.getSalary())-Integer.parseInt(obj2.getSalary()));
		System.out.println("After Sorting Name : ");
		traverseEmployee(employees);
		
		
	}

	private static void traverseEmployee(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

	public static List<Employee> getEmployees() {
		List<Employee> employees = Arrays.asList(new Employee(1, "A", "4000"), new Employee(4, "D", "5000"),
				new Employee(3, "C", "4500"), new Employee(2, "B", "3500"));
		return employees;
	}
}
