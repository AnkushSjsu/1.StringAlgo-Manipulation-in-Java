package com.string;
//Given a string you need to print longest possible substring that has exactly M unique characters. 
//If there are more than one substring of longest possible length, then print any one of them.
import java.util.HashSet;
import java.util.LinkedHashSet;
/**
 * 
 * @author Ankush
 *
 */
public class IterationOfSubtring {

	public void checkForIteraion(String str) {
		String local = "";
		String last = "";
		HashSet<Character> hs = new LinkedHashSet<Character>();
		for (int k = 0; k < str.length();) {
			if (hs.add(str.charAt(k))) {
				local = local + (str.charAt(k));
				k++;
			} else {
				break;
			}

		}
		System.out.println("longest substrinng will contain" + hs);
		int len = str.length();
		int size = hs.size();
		int rep = len / size;
		System.out.println("longest substrinng will contain :" + local);
		last = local;
		for (int i = 1; i < rep; i++) {
			last = last + local;
		}
		if (last.equalsIgnoreCase(str)) {
			System.out.print("longest string formed by repeating character");
		}
		System.out.print(">>>" + last);
	}

	public static void main(String[] args) {
		String ip = "ABCDABCDABCDABCDk";

		IterationOfSubtring ob = new IterationOfSubtring();
		ob.checkForIteraion(ip);

	}

}
