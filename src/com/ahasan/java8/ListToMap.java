package com.ahasan.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
        map.put(10, "apple");
        map.put(20, "orange");
        map.put(30, "banana");
        map.put(40, "watermelon");
        map.put(50, "dragonfruit");
        System.out.println("Map values into list");
		List<String>  listValues=new ArrayList<String>(map.values());
		listValues.forEach(System.out::println);
		
		System.out.println("Map key into list");
		List<Integer>  listKey=map.keySet().parallelStream().collect(Collectors.toList());
		listKey.forEach(System.out::println);
		
		System.out.println("Map Values into list");
		List<String>  listVal=map.values().parallelStream().collect(Collectors.toList());
		listVal.forEach(System.out::println);
	}
}
