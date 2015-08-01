package Algorithims;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Given a string, find the first non-repeating character in it. 
 * For example, if the input string is “GeeksforGeeks”, then output should be 
 * ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’.
 */

/**
 * 
 * @author Ankush
 * 
 */
public class FirstNonRepeatingCharacter {

	public void found(String str) {
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
			if (entry.getValue() == 1) {
				System.out.println("first non repeating character is : "
						+ entry.getKey());
				break;
			}
		}

	}

	public static void main(String[] args) {
		String input = "geek for queek";
		FirstNonRepeatingCharacter ch = new FirstNonRepeatingCharacter();
		ch.found(input);

	}

}
