package misc;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

	static Comparator<String> o = new Comparator<String>() {
		public int compare(String str1, String str2)
		{
			String a = str1 + str2;
			String b = str2 + str1;
			return b.compareTo(a);
		}
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {42,43,34,32,32,32,3,92};
		String[] str = new String[arr.length];
		for(int i =0;i<arr.length;i++)
		{
			str[i] = arr[i] +""; 
		}
		
		Arrays.sort(str,o);
		
		for(int k=0;k<str.length;k++)
		{
			System.out.print(str[k]);
		}
		
		//Arrays.sort(arr,);
	}

}
