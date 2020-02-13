package com.interview.logical;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CountDuplicateNo {

	public static void main(String[] args) {
		int[] inputArray = new int[] { 111, 333, 555, 777, 333, 444, 555 };

		HashMap<Integer, Integer> map = new HashMap<>();
		for (int element : inputArray) {
			if (map.get(element) == null) {
				map.put(element, 1);
			} else {
				map.put(element, map.get(element) + 1);
			}
		}
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		System.out.println("Duplicate Element \t\t  Found Time \n-------------------------------------------------");

		for (Entry<Integer, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(" \t" + entry.getKey() + "\t\t\t\t" + entry.getValue());
			}
		}

		
		
		
		
		
		
		
		
		
		
		
		// ------------------------------------------

		/*
		 * Set<Integer> uniqueElements = new HashSet<>(); Set<Integer> duplicateElements
		 * = Arrays .stream(inputArray) .filter(i -> !uniqueElements.add(i)) .boxed().
		 * collect(Collectors.toSet()); System.out.println(duplicateElements);
		 */

	}
}
