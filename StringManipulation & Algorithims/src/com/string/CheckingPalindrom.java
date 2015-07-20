package com.string;

/**
 * checking for string is palindrom or not.
 * 
 * @author Ankush
 * 
 */
public class CheckingPalindrom {
	static String str = "aa";

	public static void main(String[] args) {
		int len = str.length();
		if (len == 1) {
			System.out.println("it is a palindrom");
		}
		if ((len == 2) && str.charAt(0) == str.charAt(1)) {
			System.out.println("it is a palindrom");
		}
		if (len > 2) {
			for (int i = 0; i < len / 2 - 1; i++) {

				if ((str.charAt(len / 2 - i) != str.charAt((len / 2 + i)))
						&& ((len / 2 + i) <= len)) {

					System.out.println(" palin" + str.charAt(len / 2 - i));
				}
				System.out.println("is a  palin");
			}
		}
	}

}
