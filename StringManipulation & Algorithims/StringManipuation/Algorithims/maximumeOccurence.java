package Algorithims;
/***
 * This code will to find maximume number of occurrence of any charcter in any given string. 
 * with O(N) complexity.
 * @author Ankush
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class maximumeOccurence {
	// sort find
	int max1 = 0;
	int max2 = 0;

	//
	public void findOccurrence(String str) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {

			if (hm.containsKey(str.charAt(i))) {
				hm.put(str.charAt(i), hm.get(str.charAt(i)) + 1);
				// keep recall this line for updation of value from previous
				// value
			} else {
				int intial = 1;
				hm.put(str.charAt(i), intial);
			}
		}

		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			if (max1 < entry.getValue()) {
				max1 = entry.getValue();

			}
			if (max2 < entry.getValue() && max1 > entry.getValue()) {
				max2 = entry.getValue();

			}

		}
		System.out.println("first two maximume occurence is " + max1 + " and " + max2);
	}

	public static void main(String[] args) {
		String str = "ttthis is ssstring to be checked";
		maximumeOccurence mx = new maximumeOccurence();
		mx.findOccurrence(str);
	}

}
