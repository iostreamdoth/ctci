package chap1;

public class problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int m = 9;
		int[][] img = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {

				img[i][j] = 100 + ((10 * i) + j);
				if (img[i][j] % 17 == 0) {
					img[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(img[i][j] + " ");
			}
			System.out.println();
		}

		rowcolumnzero(img, n, m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(img[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void rowcolumnzero(int[][] img, int n, int m) {
		boolean iszeroenc = false;
		int ilaststart = n;
		int[] rowsarr = new int[n];
		int[] columnarr = new int[m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (img[i][j] == 0 && rowsarr[i] != 1 && columnarr[j] != 1) {
					for (int k = 0; k < n; k++) {
						img[k][j] =0;

					}
					for (int k = 0; k < m; k++) {
						img[i][k] =0;
					}
					rowsarr[i] =1;
					columnarr[j] = 1;

				}
			}
		}
	}
}
