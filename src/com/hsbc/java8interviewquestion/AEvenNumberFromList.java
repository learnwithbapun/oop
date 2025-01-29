package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AEvenNumberFromList {

	public static void main(String[] args) {

//		Q1 --  Find Even Numbers from a List using Streams

		List<Integer> list = Arrays.asList(1, 2, 3, 5, 4, 7, 8, 9, 22, 3, 44, 55, 66, 44, 55, 33, 23, 30, 40, 50);

		Predicate<Integer> evenListpredicate = (a -> a % 2 == 0);
//		List<Integer> evenList = list.stream().filter(evenListpredicate).collect(Collectors.toList());
		List<Integer> evenList = list.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());
		System.out.println(evenList);

	}

}
