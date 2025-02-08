package com.hsbc.java8interviewquestion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class BTest3 {

	public static void main(String[] args) {

//		Q3 How to find duplicate elements in a given integers list in java using Stream functions?

		List<Integer> duplicateList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

		// Using Sets to keep track of seen elements and duplicates
		Set<Integer> seen = new HashSet<>();

		List<Integer> filteredList = duplicateList.stream().filter(n -> !seen.add(n)).collect(Collectors.toList());
		System.out.println(filteredList);
	}
}
