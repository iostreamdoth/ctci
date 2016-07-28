package chap3;

import java.util.Stack;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<Integer>();
		Stack<Integer> temp = new Stack<Integer>();

		stack.push(3);
		stack.push(8);
		stack.push(2);
		stack.push(0);
		stack.push(9);
		stack.push(4);
		stack.push(5);

		int n = stack.size();

		int count = n;
		int count2 = n/2;
		int minj = Integer.MAX_VALUE;
		while (count2 != 0) {
			// System.out.println(stack.size());
			int j = 0;
			;
			int k = 0;

			// First swap highest
			System.out.println("First Swap");
			while (k < count) {
				if (temp.isEmpty()) {
					temp.push(stack.pop());
				} else {
					if (temp.peek() > stack.peek()) {
						j = temp.pop();
						temp.push(stack.pop());
						temp.push(j);
					} else {
						temp.push(stack.pop());
					}
				}
				k++;
			}
			// temp.push(j);
			// Second swap minimum

			// j = temp.pop();
			System.out.println("Second Swap");

			while (!temp.isEmpty()) {
				j = temp.pop();
				if (temp.isEmpty()) {
					stack.push(j);
				} else {
					if (j < temp.peek()) {
						stack.push(temp.pop());
					} else {
						stack.push(j);
					}
				}

			}
			count--;
			count2--;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}

	}

}
