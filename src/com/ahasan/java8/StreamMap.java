package com.ahasan.java8;

import java.util.Arrays;

public class StreamMap {
	public static void main(String[] args) {
		Arrays.asList("a","b","c").stream().map(String::toUpperCase).forEach(System.out::println);
		Arrays.asList(1,2,3,4).stream().map(n->n*3).forEach(System.out::println);
	}
}
