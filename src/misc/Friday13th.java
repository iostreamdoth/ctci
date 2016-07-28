package misc;

import java.util.Date;
import java.util.Scanner;

public class Friday13th {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d1,d2,m1,m2,y1,y2;
		for(int i=0;i<n;i++){
         d1 = in.nextInt();
         m1 = in.nextInt();
         y1 = in.nextInt();
         d2 = in.nextInt();
         m2 = in.nextInt();
         y2 = in.nextInt();
         calculatefriday13th(d1,m1,y1,d2,m2,y2);
        }
	}
	
	static void calculatefriday13th(int d1,int m1,int y1,int d2,int m2,int y2)
	{
		Date startDate = new Date(y1,m1,d1);
		Date endDate = new Date(y2,m2,d2);
	}

}
