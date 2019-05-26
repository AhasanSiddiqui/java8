package com.ahasan.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachTest {
	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		map.put("D", 4);
		map.put("E", 5);
		map.put("F", 6);
		map.put("G", 7);
		System.out.println("Tradition For Loop : ");
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue());
		}
		
		System.out.println("Java8 ForEach For Loop : ");
		map.forEach((k,v)->System.out.println(k+" : "+v));
		
		System.out.println("Java8 ForEach For Loop using EntrySet : ");
		map.entrySet().forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
		
		System.out.println("Traversing the list : ");
		List<String> list=Arrays.asList("A","B","C");
		list.forEach(System.out::println);
		
	}
}
