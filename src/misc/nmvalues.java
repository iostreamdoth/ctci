package misc;

import java.util.Scanner;

public class nmvalues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		final String arg =  in.nextLine();
		String[] ar  = arg.split(" ");
		int n = Integer.parseInt(ar[0]);
		int m = Integer.parseInt(ar[1]);
		int[] a = new int[n];
		String [] str = new String[m];
		for(int i=0;i<str.length;i++)
		{
			str[i] = in.nextLine();
		}
		

	}

}
