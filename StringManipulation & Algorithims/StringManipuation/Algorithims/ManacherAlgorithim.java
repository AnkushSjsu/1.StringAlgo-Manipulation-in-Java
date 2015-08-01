package Algorithims;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 * 
 * @author Ankush
 */
// Find all distinct palindromic sub-strings of a given string
// Suffix Tree Application 6 – Longest Palindromic Substring
public class ManacherAlgorithim {
	/** function to preprocess string **/
	public String preProcess(String str) {
		int len = str.length();
		if (len == 0)
			return "^$";
		String s = "^";
		for (int i = 0; i < len; i++)
			s += "#" + str.charAt(i);
		s += "#$";
		return s;
	}

	/** function to get largest palindromic substring **/
	public String getLongestPalindrome(String str) {
		/** preprocess string **/
		char[] s = preProcess(str).toCharArray();
		int N = s.length;
		int[] p = new int[N + 1];
		int id = 0, mx = 0;
		for (int i = 1; i < N - 1; i++) {
			p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 0;
			while (s[i + 1 + p[i]] == s[i - 1 - p[i]])
				p[i]++;
			if (i + p[i] > mx) {
				mx = i + p[i];
				id = i;
			}
		}

		/** length of largest palindrome **/
		int maxLen = 0;
		/** position of center of largest palindrome **/
		int centerIndex = 0;
		for (int i = 1; i < N - 1; i++) {

			if (p[i] > maxLen) {
				maxLen = p[i];
				centerIndex = i;
			}
		}
		/** starting index of palindrome **/
		// generate all possible string which form palindrom
		int pos = (centerIndex - 1 - maxLen) / 2;

		for (int j = 1; j < N - 1; j++) {
			int localLen = p[j];
			int localIndex = j;
			int localPos = (localIndex - 1 - localLen) / 2;

			if (p[j] > 1) {

				String other = str.substring(localPos, localPos + localLen);

				System.out.println("OTHER PRESENT ARE:" + other);
			}
		}
		return str.substring(pos, pos + maxLen);

	}

	/** Main Function **/
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Manacher Algorithm Test\n");
		System.out.println("\nEnter String");
		String text = br.readLine();

		ManacherAlgorithim m = new ManacherAlgorithim();
		String longestPalindrome = m.getLongestPalindrome(text);
		System.out.println("\nLongest Palindrome : " + longestPalindrome);
	}
}