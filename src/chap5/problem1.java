package chap5;

public class problem1 {
	public static int updateBits(int n, int m, int i, int j) {

		int max = ~0; /* All 1’s */
		System.out.println("max  :  " + Integer.toBinaryString(max) );
		// 1’s through position j, then 0’s
		System.out.println("n    :  " + Integer.toBinaryString(n));
		System.out.println("m    :  " + Integer.toBinaryString(m));
		System.out.println("1<<j :  " + Integer.toBinaryString((1 << j)));
		System.out.println("u-1  :  " + Integer.toBinaryString((1 << j) - 1));
		
		
		int left = max - ((1 << j) - 1);
		System.out.println("1<<i :  " + Integer.toBinaryString((1 << i)));
		System.out.println("u-1  :  " + Integer.toBinaryString((1 << i) - 1));
		System.out.println("max  :  " + Integer.toBinaryString(max));
		System.out.println("left :  " + Integer.toBinaryString(left));

		// 1’s after position i
		int right = ((1 << i) - 1);
		System.out.println("right:  " + Integer.toBinaryString(right));

		// 1’s, with 0s between i and j
		int mask = left | right;
		System.out.println("mask :  " + Integer.toBinaryString(mask));
		System.out.println("nmsk :  " + Integer.toBinaryString(n & mask));
		System.out.println("nmsk :  " + Integer.toBinaryString(m << i));
		System.out.println("both :  " + Integer.toBinaryString((n & mask) | (m << i)));

		// Clear i through j, then put m in there
		return (n & mask) | (m << i);
	}
	public static void main(String[] args) {
		updateBits(5123, 54, 1, 7);
	}

	//1010001101101
	//1010001101101
}
