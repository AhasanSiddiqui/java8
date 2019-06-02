package com.ahasan.java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAMap {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "ahasan.com");
		map.put(2, "siddiqui.com");

		String result = "";

		result = map.entrySet().stream().filter(x -> x.getKey()==2).map(x -> x.getValue())
				.collect(Collectors.joining());
		System.out.println(result);

	}
}
