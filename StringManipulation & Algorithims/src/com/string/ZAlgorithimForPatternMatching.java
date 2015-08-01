package com.string;

import java.util.HashMap;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Pattern;

/**
 * Linear time pattern searching Algorithm this implementation is not exact Z
 * Algorithm but it is faster than Z when we need to find maximum occurrence for
 * any pattern
 * 
 * @author Ankush
 * 
 */
public class ZAlgorithimForPatternMatching {
	int match;
	public int NumberOfTimePatternFound(String str) {
		int count = 0;
		
		String patttern = "aba";
		int z = 0;
		int i = 0;
		if (i < str.length()) {
			while (z < patttern.length()) {
				while (i < str.length()) {
		
					if (str.charAt(i) == patttern.charAt(z)) {
						i++;
						z++;
						
						if ((z == 2)){
							count++;
							if(count==1){
								match =i -(patttern.length()-1);
								System.out.println("First match found at  :" + match);
							}
							z = 0;
						
							System.out.println("count came" + count);
							break;
						}

					} else {
						i++;
						if (z == 1) {

							z = 0;
							break;
						}
					}
				}

			}
		
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("counting");
		ZAlgorithimForPatternMatching nm = new ZAlgorithimForPatternMatching();

		int count = nm.NumberOfTimePatternFound("ababababaceffababababbdsajab");
		System.out.println("count of repetition is " + count);

	}

}
