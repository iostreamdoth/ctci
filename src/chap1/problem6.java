package chap1;

public class problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int[][] img = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				img[i][j] = 100 + ((10 * i) + j);
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(img[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		turnimage90degree(img, n);
	}

	public static void turnimage90degree(int[][] img, int n) {
		if (n == 1) {
			return;
		}
		int tir = n / 2;
		int subt = 1;
		if (n % 2 == 1) {
			subt = 0;
		}

		int temp = 0;
		for (int i = 0; i < tir; i++) {
			for (int j = i; j < n - i - 1; j++) {
				temp = img[i][j];
				/*System.out.println("for i with value :" + i + " 4 values are :"
						+ img[i][j] + " ," + img[n - j - 1][i] + ","
						+ img[n - i - 1][n - j - 1] + "," + img[j][n - i - 1]);*/
				img[i][j] = img[n - j - 1][i];
				img[n - j - 1][i] = img[n - i - 1][n - j - 1];
				img[n - i - 1][n - j - 1] = img[j][n - i - 1];
				img[j][n - i - 1] = temp;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(img[i][j] + " ");
			}
			System.out.println();
		}
	}
}
