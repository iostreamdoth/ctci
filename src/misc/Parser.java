package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Parser{
    
    public static void main(String []argh) 
	{
		/*Parser X=new Parser();
		

		
		int[] a1 = {1,2,2,1};
		int[] a2 = {2,2};
		int []x = intersection(a1,a2);
		for(int i = 0;i<x.length;i++){
			System.out.println(x[i]);
		}*/
    	
    	FileReader file = new FileReader("C:\\test\\a.txt");
        BufferedReader fileInput = new BufferedReader(file);
         
        // Print first 3 lines of file "C:\test\a.txt"
        for (int counter = 0; counter < 3; counter++) 
            System.out.println(fileInput.readLine());
         
        fileInput.close();

		
	}
    
    public  boolean checkParenthesisBalance(String str){
        Stack<Character> s = new Stack<Character>();
        for(int index = 0;index<str.length();index++){
            char ch = str.charAt(index);
            if(ch == '{' || ch == '(' || ch == '['){
                s.push(ch);
            }
            else{
                if(s.isEmpty())
                    {
                    return false;
                }
                if(ch == '}'){
                    if(s.pop()!='{'){return false;}
                }else if(ch==')'){
                    if(s.pop()!='('){return false;}
                }
                else if(ch==']'){
                    if(s.pop()!='['){return false;}
                }
                
            }
        }
        if(s.isEmpty()){
            return true;
        }else{return false;}
        
    }
    
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for(int i: nums1){
            set1.add(i);
        }
     
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int i: nums2){
            set2.add(i);
        }
     
        Iterator<Integer> iter = set1.iterator();
        while(iter.hasNext()){
            int i = iter.next();
            if(!set2.contains(i)){
                iter.remove();
            }
        }
     
        int[] result = new int[set1.size()];
        int i=0;
        for(int x: set1){
            result[i++]=x;
        }
     
        return result;
    }

    
    
    
    
    
    
}