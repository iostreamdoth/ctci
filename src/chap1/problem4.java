package chap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		anagramornot2("miss", "sims");

	}

	public static void anagramornot1(String str1, String str2) {
		if (str1 == null || str2 == null) {
			System.out.println("Not Anagram");
			return;
		}
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
			return;
		}

		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		
		
		
	}

	public static void anagramornot2(String str1, String str2) {
		if (str1 == null || str2 == null) {
			System.out.println("Not Anagram");
			return;
		}
		if (str1.length() != str2.length()) {
			System.out.println("Not Anagram");
			return;
		}

		char[] chr1 = str1.toCharArray();
		char[] chr2 = str2.toCharArray();
		HashMap<Character, Integer> map1 = new HashMap<>();
		HashMap<Character, Integer> map2 = new HashMap<>();

		for (int i = 0; i < chr1.length; i++) {
			if (!map1.containsKey(chr1[i]))
				map1.put(chr1[i], 1);
			else
				map1.put(chr1[i], map1.get(chr1[i]));
		}
		for (int i = 0; i < chr2.length; i++) {
			if (!map2.containsKey(chr2[i]))
				map2.put(chr2[i], 1);
			else
				map2.put(chr2[i], map2.get(chr2[i]));
		}

		Iterator it = map1.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			char key = (char) pair.getKey();
			if (map1.get(key) != map2.get(key)) {
				System.out.println("Not Anagram");
				return;
			}

		}
		System.out.println("Anagram");

	}

}
