package com.string;
/***
 * Removing all duplicate value in string and spaces:  this solution will do this is In O(N) complexity.
 * @author Ankush
 *
 */
public class RemovingAllSpacesAndDuplicate {

	public static boolean isUniqueChars2(String str) {
		int val;
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i);
			System.out.println("val :" + val + "" + char_set[val]);
			if (char_set[val]) {
				System.out.println("first repeatinng is  :" + str.charAt(i));
				return false;
			}
			char_set[val] = true;
		}
		return true;
	}
// removing all repeated character
	public void removingAllRepeatedCharacters(String str) {
		char[] characters = str.toCharArray();
		String result = " ";
		for (char c : characters) {
			if (result.indexOf(c) < 0) {
				result += Character.toString(c);
				
			}

		}
		System.out.println(result);
	}

	public void removingSpaces(String str) {
		char[] character = str.toCharArray();
		String result = "";
		int i = 0;
		for (; i < character.length; i++) {
			int j = i + 1;
			if (character[i] == ' ') {
				while (character[j] == ' ') {
					j++;
					i++;
				}
				System.out.println("here" + character[i]);
				result += character[i];

			}
			result += character[i];

		}
		System.out.println("result is :: " + result);
		/*
		 * for(char c :character ){
		 * 
		 * if(c != ' ' ){
		 * 
		 * if(c != ' ' ){ result += Character.toString(c); }
		 * 
		 * 
		 * } } System.out.print( result);
		 */

	}

	public static void main(String[] args) {
		RemovingAllSpacesAndDuplicate uqChar = new RemovingAllSpacesAndDuplicate();
		uqChar.removingAllRepeatedCharacters("abbcijskm sdfdds");
		uqChar.removingSpaces("askjDJA        ASKC JDA   ASVCJ");
		 boolean Val = uqChar.isUniqueChars2("aaabc");
		// System.out.println(Val);

	}

}