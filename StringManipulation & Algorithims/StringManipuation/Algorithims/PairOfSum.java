package Algorithims;

// this question is to find out pair of such number in any set of numbers given, which is making certain sum.
// this solution finds out this in O(N) space complexity and same for time.
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/***
 * 
 * @author Ankush
 * 
 */

public class PairOfSum {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 6, 3, 3, 5 };
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {

				hm.put(arr[i], 1);
			}
		}

		Iterator it = hm.entrySet().iterator();
		int totalpair = 0;
		while (it.hasNext()) {
			int count = 0;
			Map.Entry pair = (Map.Entry) it.next();
			count = (int) pair.getValue();
			
			totalpair = totalpair + (count * (count - 1)) / 2;
		}

		System.out.println(">> total number of value" + totalpair);

	}

}
