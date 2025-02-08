package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class BTest6 {

	public static void main(String[] args) {

		// Q6 Given a list of integers, find the maximum value element present in it
		// using Stream functions?

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
		Optional<Integer> maxElement = myList.stream().max(Comparator.naturalOrder());
		maxElement.ifPresent(System.out::println);
	}

}
