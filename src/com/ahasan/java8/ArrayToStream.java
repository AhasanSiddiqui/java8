package com.ahasan.java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayToStream {
	public static void main(String[] args) {
		//Arrays.stream
		System.out.println("Arrays.Stream Example : ");
		String str[]={"a","b","c","d","e","f"};
		Arrays.stream(str).forEach(System.out::println);
		
		System.out.println("Stream.of Example : ");
		//Arrays.of
		Stream.of(str).forEach(System.out::println);
		
		System.out.println("Primitive Arrays Example : ");
		
		int [] intArray= {1,2,3,4,5};
		Arrays.stream(intArray).forEach(System.out::println);
		

		System.out.println("Primitive Arrays.stream Example With IntStream Class: ");
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(System.out::println);
		
		System.out.println("Primitive Stream.of Example With IntStream Class: ");
		Stream<int[]> temp = Stream.of(intArray);
		temp.flatMapToInt(x->Arrays.stream(x)).forEach(System.out::println);
	}
}
