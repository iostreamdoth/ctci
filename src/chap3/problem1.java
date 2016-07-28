package chap3;

public class problem1 {

	static int n = 12;
	static int[] stackpositions = new int[3];
	static int[] stackarray = new int[n];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackpositions[0] = 0;
		stackpositions[1] = n / 3;
		stackpositions[2] = (2 * n) / 3;
		
		System.out.println("Pushing in stack 1");
		push(1,10);
		push(1,11);
		push(1,12);
		push(1,13);
		
		
		System.out.println("Pushing in stack 2");
		push(2,20);
		push(2,21);
		push(2,22);
		push(2,23);
		
		
		System.out.println("Pushing in stack 3");
		push(3,30);
		push(3,31);
				
		System.out.println("Poping stack 1");
		pop(1);
		pop(1);
		pop(1);
		pop(1);
		
		System.out.println("Poping stack 2");
		pop(2);
		pop(2);
		pop(2);
		pop(2);
		
		System.out.println("Poping stack 3");
		pop(3);
		pop(3);
		pop(3);
		pop(3);

	}

	public static void push(int stacknumber, int element) {
		int top = ((stacknumber * n) / 3);
		if (stackpositions[stacknumber - 1] < top-1) {
			// Proceed
			stackarray[stackpositions[stacknumber - 1]] = element;
			System.out.println("Element Pushed: " + element);
			stackpositions[stacknumber - 1]++;
		} else {
			// Error
			System.out.println("Stack Overflow");
		}
	}

	public static void pop(int stacknumber) {
		int end = ((stacknumber - 1) * n) / 3;
		stackpositions[stacknumber - 1]--;
		if (stackpositions[stacknumber - 1] >= end) {
			// Proceed
			System.out.println("Element pop = "
					+ stackarray[stackpositions[stacknumber - 1]]);
			
		} else {
			System.out.println("Stack is empty");
		}
	}
}
