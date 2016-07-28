package chap3;

import java.util.Stack;

public class problem2 extends Stack<Integer> {

	Stack<Integer> minStack;

	public problem2() {
		minStack = new Stack<Integer>();
	}

	public void push(int val) {
		if (min() >= val) {
			minStack.push(val);
		}
		super.push(val);
	}

	public Integer pop() {
		int val = super.pop();
		if (val == min()) {
			minStack.pop();
		}
		return val;
	}

	public Integer min() {
		if (minStack.isEmpty())
			return Integer.MAX_VALUE;
		else
			return minStack.peek();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem2 o  = new problem2();
		o.push(31);
		o.push(9);
		o.push(34);
		o.push(92);
		o.push(21);
		o.push(5);
		System.out.println(o.min());
		
	}

}
