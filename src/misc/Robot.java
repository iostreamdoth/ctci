package misc;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Robot {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        HashMap hMap = new HashMap<Integer,String>();
        int n = 30;
        int[] ar = new int[n];
        int x,y;
        x=0;
        y=0;
        int max = -1;
        int xmul = 1;
        int ymul = 1;
        boolean islr=true;
        for(int i=0;i<n;i++){
            ar[i]=i+1;
            if(ar[i]>max)
            {
            	max = ar[i];
            }
            
        }  
    }
}