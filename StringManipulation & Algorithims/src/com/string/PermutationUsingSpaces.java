package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PermutationUsingSpaces {
	static Set<String> set = new HashSet<String>();

	public static void main(String[] args) {
		combination("", "ABCDEGHI");
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);

		}
		System.out.println(" size" + set.size());
	}

	static void combination(String pre, String s) {
		int N = s.length();

		set.add(pre + s);
		if (s.length() >= 2) {
			combination(pre + s.charAt(0) + "_", s.substring(0 + 1));
			combination(pre + s.charAt(0), s.substring(0 + 1));
		}

	}

}