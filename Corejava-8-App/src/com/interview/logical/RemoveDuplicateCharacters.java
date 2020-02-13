package com.interview.logical;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String s = "aabbccdef";
		Set<Character> set = new LinkedHashSet<Character>();
		for (char c : s.toCharArray()) {
			set.add(Character.valueOf(c));
		}
		System.out.println(set.toString());
		for (char sw : set) {
			System.out.print(sw);
		}
	}
}
