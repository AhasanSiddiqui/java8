package com.ahasan.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNullValuesFromStream {
	public static void main(String[] args) {
		Stream<String> letters = Stream.of("a", "b", null, "c", null);
		letters.filter(a -> !(a==null)).collect(Collectors.toList()).forEach(System.out::println);
		//or
		//letters.filter(a -> (a!=null)).collect(Collectors.toList()).forEach(System.out::println);
	}
}
