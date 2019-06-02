package com.ahasan.java8;

import java.util.Arrays;

public class StreamStringFlatMap {
	public static void main(String[] args) {
		String [][] data= {{"a","b"},{"c","d"},{"e","f"}};
		 
		//Stream<String[]>
		Arrays.stream(data).flatMap(x->Arrays.stream(x)).forEach(System.out::println);
		
	     //filter a stream of string[], and return a string[]?
		
		//Stream<String[]> stream = temp.filter(x->"a".equals(x.toString()));
		
		//empty...
		//stream.forEach(System.out::println);
		
		//Stream<String>, GOOD!
		//Stream<String> stream = temp.flatMap(x->Arrays.stream(x));
		//stream.filter(a->"a".equals(a));
		
		//stream.forEach(System.out::println);
		
	}
}
