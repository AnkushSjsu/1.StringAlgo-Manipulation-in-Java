package Algorithims;
// longest substring which is made by unique character.
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class LongestSub {

	public void longestString(String str) {
		int diff = 0, ini = 0, i = 0;
		HashMap<Integer, Character> hs = new HashMap<Integer, Character>();
		for (i = 0; i < str.length(); i++) {
			if (!hs.containsValue(str.charAt(i))) {
				hs.put(i, str.charAt(i));
			} else {
				Character value = str.charAt(i);
				for (Map.Entry entry : hs.entrySet()) {
					if (value.equals(entry.getValue())) {
						ini = (int) entry.getKey();
						hs = new HashMap<Integer, Character>();
						break; // breaking because its one to one map
					}
				}
				if (diff > i - ini) {
					diff = i - ini;
				}
			}
		}
		System.out.println( "total length  " + (i - ini) + "  substrring is "
				+ str.substring(ini, i));
	}

	public static void main(String[] args) {
		String ip = "aahhchjvhgcghvvhcvcpolmnhuyyyigfycxxcbc";
		LongestSub sub = new LongestSub();
		sub.longestString(ip);
	}

}
