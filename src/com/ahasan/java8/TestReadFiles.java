package com.ahasan.java8;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFiles {
	public static void main(String[] args) {
		String uri="c://AhasanCodeWork/lines.txt";
		try ( Stream<String> stream =Files.lines(Paths.get(uri))) {
			stream.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
