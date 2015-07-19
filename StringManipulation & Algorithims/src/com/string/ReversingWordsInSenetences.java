package com.string;

/**
 * pritning a string in which it will reverse the words from last for example :
 * Input :  My dream is to start a company
 * Output should be: company a start to is dream My
 * 
 **/

/**
 * 
 * @author Ankush :- this question could be done in several ways using other data
 *         structure like hashmap, linked list and other. but here is solution
 *         by string only. Complexity for this solution is : O(N) where N-
 *         length of input string
 * 
 */
public class ReversingWordsInSenetences {

	public static void main(String[] agrs) {
		StringBuffer sb = new StringBuffer();
		StringBuffer out = new StringBuffer();
		String in = " My dream is to start a company";
		int pos = 1;
		sb.append(' ');
		for (int i = in.length() - 1; i >= 0; i--) {
			if (in.charAt(i) != ' ') {
				sb.append(in.charAt(i));
			}
			if (in.charAt(i) == ' ' || i == 0) {
				StringBuffer result = new StringBuffer();
				for (int k = sb.length() - 1; k >= 0; k--) {
					result.append(sb.charAt(k));
				}
				out = out.append(result);
				sb = new StringBuffer();
				sb.append(' ');
			}

			System.out.println("here is: \t" + out.toString());
		}

	}
}
