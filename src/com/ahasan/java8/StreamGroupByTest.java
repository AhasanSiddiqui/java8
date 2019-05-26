package com.ahasan.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ahasan.java8.beans.Item;

public class StreamGroupByTest {
	private static List<String> list;

	public static void main(String[] args) {
		list = Arrays.asList("a","a","a","b","d","b");
		Map<String, Long> result = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		result.entrySet().forEach(en->System.out.println(en.getKey()+" : "+en.getValue()));
		
		//Sorting
		Map<String,Long> action=new LinkedHashMap<String, Long>();
		result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue()).forEach(a->action.put(a.getKey(), a.getValue()));
		action.entrySet().forEach(en->System.out.println(en.getKey()+" : "+en.getValue()));
	
		
		List<Item> items= Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99")));
		Map<String, Long> counting = items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
		counting.entrySet().forEach(act->System.out.println(act.getKey()+" : "+act.getValue()));
		
		Map<String, Integer> sum = items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.summingInt(Item::getQty)));
		sum.entrySet().forEach(act->System.out.println(act.getKey()+" : "+act.getValue()));
		
		Map<BigDecimal, List<Item>> collect = items.stream().collect(Collectors.groupingBy(Item::getPrice));
		collect.entrySet().forEach(act->System.out.println(act.getKey()+" : "+act.getValue()));
		
	}
}
