package com.ahasan.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.ahasan.java8.beans.Employee;

public class StreamFilter {
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("A", "B", "C", "D", "E", "F");
		System.out.println("Trandition Approach ");
		List<String> list = getFilterOutput(lines, "E");
		for (String string : list) {
			System.out.println(string);
		}
		
		System.out.println("Java8  Approach ");
		lines.stream().filter(line -> !"E".equals(line)).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Employee> employees=TestEmployeeSorting.getEmployees();
		Employee rs=employees.stream().filter(x->"H".equals(x.getName())).findAny().orElse(null);
		System.out.println("Employee : "+rs);
	}

	private static List<String> getFilterOutput(List<String> lines, String string) {
		List<String> result = new ArrayList<String>();
		for (String str : lines) {
			if (!"E".equals(str)) {
				result.add(str);
			}
		}
		return result;
	}
}
