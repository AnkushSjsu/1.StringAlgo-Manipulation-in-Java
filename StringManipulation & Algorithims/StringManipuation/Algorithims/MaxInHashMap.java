package Algorithims;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MaxInHashMap {

	public static void main(String args[]) {
		// create a hash set
		String string = "";

		LinkedHashSet hs = new LinkedHashSet();
		// add elements to the hash set
		String str = "aaaabbbccssss ";
		int count = 1;
		int local = 1;
		for (int i = 0; i < str.length(); i++) {
			if ((hs.add(str.charAt(i)))) {
				string += local;
				string += str.charAt(i);

				count = 1;

			} else {
				count++;

				local = count;

			}

		}
		System.out.println(string.substring(1, string.length() - 1));
	}
}