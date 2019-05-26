package com.ahasan.java8;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamIsClosed {
	public static void main(String[] args) {
		
		String [] str= {"a","b","c","d","f"};
		Stream<String> stream = Arrays.stream(str);

        // loop a stream
		System.out.println("Using First Time : ");
        stream.forEach(x -> System.out.println(x));

        System.out.println("Using Again Time : ");
        // reuse it to filter again! throws IllegalStateException
       // long cnt = stream.filter(x -> "b".equals(x)).count();
        //System.out.println(cnt);
		Supplier<Stream<String>> supplier= ()->Stream.of(str);
		
		supplier.get().forEach(System.out::println);
		// reuse it to filter again! throws IllegalStateException
		System.out.println("reuse it to filter again Without Any Problem With Supplier! ");
		long count = supplier.get().filter(a->!"b".equals(a)).count();
		System.out.println(count);
	}
}
