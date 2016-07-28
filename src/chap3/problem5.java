package chap3;

import java.util.Stack;

public class problem5 {

	Stack<Integer> stack1;
	Stack<Integer> stack2;

	problem5() {
		stack1 = new Stack<Integer>();
		stack2 = new Stack<Integer>();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem5 MyQueue= new problem5();
		MyQueue.enqueue(1);
		MyQueue.enqueue(34);
		MyQueue.enqueue(123);
		MyQueue.enqueue(11);
		MyQueue.enqueue(41);
		MyQueue.enqueue(31);
		MyQueue.enqueue(145);
		
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		System.out.println(MyQueue.dequeue());
		

	}

	public void enqueue(Integer val) {
		stack1.push(val);
	}

	public int dequeue() {
		
		while(!stack1.isEmpty())
		{
			stack2.push(stack1.pop());
		}
		int retval = stack2.pop();
		while(!stack2.isEmpty())
		{
			stack1.push(stack2.pop());
		}
		
		return retval;
	}

}
