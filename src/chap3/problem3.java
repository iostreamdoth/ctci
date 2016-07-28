package chap3;

import java.util.Stack;

public class problem3 extends Stack<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6041977827896702450L;

	Stack<Stack<Integer>> stacks;

	int thresh = 3;

	problem3() {
		stacks = new Stack<Stack<Integer>>();
	}

	public void push(int value) {

		if (stacks.isEmpty()) {
			Stack<Integer> temp = new Stack<Integer>();

			temp.push(value);
			stacks.push(temp);

		} else {
			Stack<Integer> temp;
			if (stacks.peek().size() == thresh) {
				temp = new Stack<Integer>();
				temp.push(value);
				stacks.push(temp);
			} else {

				stacks.peek().push(value);
			}
		}
		System.out.println("Pushing to stack : " + (stacks.size()));
	}

	public Integer pop() {
		if (stacks.isEmpty()) {
			System.out.println("Nothing to Pop");
			return null;
		}
		int returnval = stacks.peek().pop();
		System.out.println("Poping from stack : " + (stacks.size()));
		if (stacks.peek().isEmpty()) {
			stacks.pop();
		}
		return returnval;
	}

	public int size() {
		return stacks.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem3 SetOfStacks = new problem3();
		SetOfStacks.push(1);
		SetOfStacks.push(2);
		SetOfStacks.push(3);
		SetOfStacks.push(4);
		SetOfStacks.push(5);
		SetOfStacks.push(6);
		SetOfStacks.push(7);
		SetOfStacks.push(8);
		SetOfStacks.push(9);
		SetOfStacks.push(10);
		SetOfStacks.push(11);
		SetOfStacks.push(12);
		SetOfStacks.push(13);
		SetOfStacks.push(14);
		System.out.println("Pushing complete");
		/*
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 * System.out.println("Popping from stack :" + SetOfStacks.size() +
		 * " ,Value: " + SetOfStacks.pop());
		 */
		SetOfStacks.popat(2);

	}

	public int popat(int pos) {
		Stack<Stack<Integer>> temp = new Stack<Stack<Integer>>();
		for (int i = 0; i < pos; i++) {
			temp.push(stacks.pop());
		}
		
		Stack<Integer> stack = temp.pop();
		int retval = stack.pop();
		Stack<Integer> st;
		Stack<Integer> t = new Stack<Integer>();
		
		while (!temp.isEmpty()) {
			st = temp.pop();
			
			while (!st.isEmpty()) {
				t.push(st.pop());
			}
			
			if (!t.isEmpty())
				stack.push(t.pop());
			
			stacks.push(stack);
			while (t.isEmpty()) {
				st.push(t.pop());
			}
			stack = st;
			
		}
		if (!stack.isEmpty())
			stacks.push(stack);

		System.out.println("Popping value: " + retval);
		return retval;
	}

}
