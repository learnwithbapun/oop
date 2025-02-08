package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.List;

public class BTest5 {

	public static void main(String[] args) {

		// Q5 Given a list of integers, find the total number of elements present in the
		// list using Stream functions?

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		long n = myList.stream().count();
		System.out.println(n);
	}
}
