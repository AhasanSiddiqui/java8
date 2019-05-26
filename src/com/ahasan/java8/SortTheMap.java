package com.ahasan.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortTheMap {

	Map<String, Integer> map = new LinkedHashMap<String, Integer>();

	public static void main(String[] args) {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);

		System.out.println("Original...");
		unsortMap.entrySet().forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));

		Map<String, Integer> sortedByKey = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		unsortMap.entrySet().parallelStream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (o, n) -> o, LinkedHashMap::new));

		System.out.println("Sorted By Key First Way");
		sortedByKey.entrySet().forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));

		Map<String, Integer> sortedByValue = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		System.out.println("Sorted By Value FirstWay");
		sortedByValue.entrySet().forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));

		Map<String, Integer> result = new LinkedHashMap<String, Integer>();

		unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(a -> result.put(a.getKey(), a.getValue()));

		System.out.println("Sorted By Key Second Way");
		result.entrySet().forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));

		unsortMap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
				.forEachOrdered(a -> result.put(a.getKey(), a.getValue()));

		/*
		 * unsortMap.entrySet().parallelStream().sorted(Map.Entry.comparingByValue())
		 * .forEach(x -> result.put(x.getKey(), x.getValue()));
		 */

		System.out.println("Sorted By Value Second Way");
		result.entrySet().forEach(a -> System.out.println(a.getKey() + " : " + a.getValue()));

	}

}
