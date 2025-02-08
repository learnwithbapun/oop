package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BTest2 {

	public static void main(String[] args) {

		// Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions?

		List<Integer> integer2 = Arrays.asList(1, 10, 15, 100, 101, 110, -10, -15);

		List<Integer> filteredIntegers = integer2.stream().filter(n -> n / 10 == 1).collect(Collectors.toList());
		System.out.println(filteredIntegers);
		// It will fail..

		// Correct Solution
		List<Integer> correctFilteredIntegers = integer2.stream().filter(s -> s.toString().startsWith("1"))
				.collect(Collectors.toList());
		System.out.println(correctFilteredIntegers);

		List<String> correctFilteredIntegers2 = integer2.stream().map(s -> s.toString()).filter(s -> s.startsWith("1"))
				.collect(Collectors.toList());
		System.out.println("testong " + correctFilteredIntegers2);

		// Correct Solution how to fit the - numbers
		List<Integer> correctFilteredIntegers1 = integer2.stream()
				.filter(s -> Integer.toString(Math.abs(s)).startsWith("1")).collect(Collectors.toList());
		System.out.println(correctFilteredIntegers1);

	}

}