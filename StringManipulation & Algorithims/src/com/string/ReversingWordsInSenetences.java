package com.string;

/**
 * pritning a string in which it will reverse the words from last for example :
 * My dream is to start a company output should be: company a start to is dream
 * my
 **/

public class ReversingWordsInSenetences {

	public static void main(String[] agrs) {
		StringBuffer sb = new StringBuffer();
		StringBuffer result = new StringBuffer();
		String in = "this is career";
		for (int i = in.length()-1; i >= 0; i--) {
			sb.append(in.charAt(i));
		}
		System.out.println(">> " + sb.toString());
		for (int i = sb.length()-1; i >= 0; i--) {
			result.append(sb.charAt(i));
		}
		

	}
}
