package com.ahasan.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamToList {
	public static void main(String[] args) {
		//Converting Stream into List
		List<String> collect = Stream.of("JAVA","PHP","PHTHON").collect(Collectors.toList());
		collect.forEach(System.out::println);
		//Converting Into List and then doing the Cube
		Stream.of(1,2,3,4,5,6,7).map(a->a*a*a).collect(Collectors.toList()).forEach(System.out::println);
	}
}
