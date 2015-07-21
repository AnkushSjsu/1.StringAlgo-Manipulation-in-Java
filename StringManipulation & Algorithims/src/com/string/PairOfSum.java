package com.string;
// this question is to find out pair of such number in any set of numbers given, which is making certain some.
// this solution finds out this in O(N) space complexity and same for time.
import java.util.HashMap;
/***
 * 
 * @author Ankush
 *
 */
public class PairOfSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 7, 8, 9 };
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])&& map.containsValue(10-arr[i])) {
				System.out.println("pair is found" + arr[i] + "and"
						+ (10 - arr[i]));
			} else
				map.put(10 - arr[i], arr[i]);

		}

	}
}
