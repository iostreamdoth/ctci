package misc;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
	
	
	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length(), ans = 0;
	        Map<Character, Integer> map = new HashMap<>(); // current index of character
	        // try to extend the range [i, j]
	        for (int j = 0, i = 0; j < n; ++j) {
	            if (map.containsKey(s.charAt(j))) {
	                i = Math.max(map.get(s.charAt(j)), i);
	            }
	            ans = Math.max(ans, j - i + 1);
	            
	            
	            System.out.print(ans);
	           
	            
	            System.out.print(" ");
	            System.out.print(j - i + 1);
	            
	            System.out.print(" ");
	            System.out.print(s.charAt(j));
	            System.out.print(" ");
	            System.out.print(i );
	            System.out.print(" ");
	            System.out.println(j + 1);
	            map.put(s.charAt(j), j + 1);
	        }
	        return ans;
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("quiyyckywyorks"));
	}

}
