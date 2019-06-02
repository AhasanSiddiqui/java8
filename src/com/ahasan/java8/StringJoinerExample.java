package com.ahasan.java8;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {
	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("aaa");
		joiner.add("bbb");
		joiner.add("ccc");
		String result = joiner.toString();
		System.out.println(result);

		StringJoiner sj = new StringJoiner("/", "prefix-", "-suffix");
		sj.add("2016");
		sj.add("02");
		sj.add("26");
		String result2 = sj.toString(); // prefix-2016/02/26-suffix
		System.out.println(result2);

		String rs = String.join("-", "2019", "06", "02");
		System.out.println(rs);

		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		// java, python, nodejs, ruby
		String result3 = String.join(", ", list);
		System.out.println(result3);

		List<String> list2 = Arrays.asList("java", "python", "nodejs", "ruby");

		// java | python | nodejs | ruby
		String result4 = list2.stream().map(x -> x).collect(Collectors.joining(" | "));
		System.out.println(result4);
		new StringJoinerExample().test();
	}

	 void test() {

		List<Game> list = Arrays.asList(new Game("Dragon Blaze", 5), new Game("Angry Bird", 5),
				new Game("Candy Crush", 5));

		// {Dragon Blaze, Angry Bird, Candy Crush}
		String result = list.stream().map(x -> x.getName()).collect(Collectors.joining(", ", "{", "}"));
		System.out.println(result);

	}

	class Game {
		String name;
		int ranking;

		public Game(String name, int ranking) {
			this.name = name;
			this.ranking = ranking;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getRanking() {
			return ranking;
		}

		public void setRanking(int ranking) {
			this.ranking = ranking;
		}
	}

}
