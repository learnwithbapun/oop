package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BTest1 {
	public static void main(String[] args) {

		// Given a list of integers, find out all the even numbers exist in the list
		// using Stream functions.

		List<Integer> integers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

		List<Integer> evenIntegers = integers.stream().filter(evenNumber -> evenNumber % 2 == 0)
				.collect(Collectors.toList());
		System.out.println(evenIntegers);

		// Using method reference
		List<Integer> evenIntegers1 = integers.stream().filter(BTest1::isEven).collect(Collectors.toList());
		System.out.println(evenIntegers1);

		// Using parallel stream for potentially better performance with large lists
		List<Integer> evenIntegersParallel = integers.parallelStream().filter(BTest1::isEven)
				.collect(Collectors.toList());
		System.out.println(evenIntegersParallel);
	}

	private static boolean isEven(int number) {
		return number % 2 == 0;
	}
}