package misc;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Linkedin {
	
	
	public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {

                stack.push(c);

            }else if(c == ']') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '[') return false;

            }else if(c == ')') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '(') return false;

            }else if(c == '}') {
                if(stack.isEmpty()) return false;
                if(stack.pop() != '{') return false;
            }

        }
        return stack.isEmpty();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NodeV x = new NodeV();
		NodeV head=x;
		x.data=9;
		x.next = new NodeV();
		x = x.next;
		x.data=1;
		x.next = new NodeV();
		x = x.next;
		x.data=4;
		x.next = new NodeV();
		x = x.next;
		x.data=3;
		x.next = new NodeV();
		x = x.next;
		x.data=6;
		x.next = null;
		
		x = sortlist(head); 
		
		while(x!=null)
		{
			System.out.println(x.data);
			x = x.sortedorder;
		}
		System.out.println("Normal List");
		x = head;
		
		while(x!=null)
		{
			System.out.println(x.data);
			x = x.next;
		}

		
		
	}
	
	public static NodeV sortlist(NodeV node)
	{
		NodeV current = node;
		//current.sortedorder = null;
		NodeV sortedhead = node;
		
		current = current.next;
		
		while(current!=null)
		{
			
			
			if(current.data<sortedhead.data)
			{
				System.out.println("IN less ");
				current.sortedorder = sortedhead;
				sortedhead = current;
				
			}
			else
			{
				System.out.println("IN great ");
				NodeV x = sortedhead;
				NodeV prev = null;
				while(x.data< current.data && x!=null)
				{
					prev= x;
					x = x.sortedorder;
				}
				prev.sortedorder = current;
				current.sortedorder = x;
			}
			
			current= current.next;
		}
		return sortedhead;
	}

}
