package chap3;

import java.util.Stack;

public class problem4 {

	static Stack<Integer> source1;
	static Stack<Integer> mid1;
	static Stack<Integer> dest1;
	static int n1;

	public static void hanoi(Stack<Integer> source, Stack<Integer> mid,
			Stack<Integer> dest, int n) {
		if (n == 1) {

			dest.push(source.pop());
			printstacks();
		} else {
			// System.out.println(n);
			hanoi(source, dest, mid, n - 1);
			dest.push(source.pop());
			printstacks();
			hanoi(mid, source, dest, n - 1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> source = new Stack<Integer>();
		Stack<Integer> mid = new Stack<Integer>();
		Stack<Integer> dest = new Stack<Integer>();
		int n = 5;
		n1 = n;
		for (int i = 0; i < n; i++) {
			source.push(n - i);
		}
		source1 = source;
		mid1 = mid;
		dest1 = dest;
		printstacks();
		hanoi(source, mid, dest, n);

		for (int i = 0; i < n; i++) {
			System.out.println(dest.pop());
		}

	}

	public static void printstacks() {
		Stack<Integer> source = source1;
		Stack<Integer> mid = mid1;
		Stack<Integer> dest = dest1;
		Stack<Integer> tempsource = new Stack<Integer>();
		Stack<Integer> tempmid = new Stack<Integer>();
		Stack<Integer> tempdest = new Stack<Integer>();
		int temp;
		for (int i = n1; i > 0; i--) {
			if (source.size() == i) {
				temp = source.pop();
				tempsource.push(temp);
				System.out.print(temp);
			} else {
				System.out.print("|");
			}
			System.out.print("     ");
			if (mid.size() == i) {
				temp = mid.pop();
				tempmid.push(temp);
				System.out.print(temp);
			} else {
				System.out.print("|");
			}
			System.out.print("     ");
			if (dest.size() == i) {
				temp = dest.pop();
				tempdest.push(temp);
				System.out.print(temp);
			} else {
				System.out.print("|");
			}
			
			System.out.println("");
		}
		System.out.println("********************");
		//System.out.println("This is complete");
		while (!tempsource.isEmpty()) {
			source.push(tempsource.pop());
		}
		//System.out.println("This is complete");
		while (!tempmid.isEmpty()) {
			mid.push(tempmid.pop());
		}
		//System.out.println("This is complete");
		while (!tempdest.isEmpty()) {
			dest.push(tempdest.pop());
		}
		//System.out.println("This is complete");
	}

}
