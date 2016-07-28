package misc;

public class amazonsolvemaze {

	public static int isPath(int[][] grid) {
		//printgrid(grid);
		int k = findpath(grid, 0, 0);
		
		return k;
	}

	public static int findpath(int[][] grid, int x, int y) {
		if (x == grid.length || y == grid[0].length || x<0 || y<0)
			return 0;

		if (grid[x][y] == 0) {
			return 0;
		} else {
			if (grid[x][y] == 9) {
				return 1;
			} else {
				grid[x][y] = 0;
				int j = findpath(grid, x, y + 1);
				if (j == 1)
					return 1;

				int k = findpath(grid, x + 1, y);
				if (k == 1)
					return 1;
				int l = findpath(grid, x - 1, y);
				if (l == 1)
					return 1;

				int m = findpath(grid, x, y - 1);
				if (m == 1)
					return 1;

				grid[x][y] = 1;
				
				return 0;

			}

		}

	}

	public static void main(String[] args) {

		int[][] grid = new int[6][6];
		grid[0][0] = 1;
		grid[1][0] = 1;
		grid[2][0] = 1;
		grid[3][0] = 1;
		grid[4][0] = 1;
		grid[5][0] = 1;

		grid[5][0] = 1;
		grid[5][1] = 1;
		grid[5][2] = 1;
		grid[5][3] = 1;
		grid[5][4] = 1;
		grid[5][5] = 1;

		grid[2][2] = 1;

		grid[2][3] = 1;
		grid[3][2] = 1;
		grid[4][2] = 9;

		System.out.println(isPath(grid));

	}

	public static void printgrid(int[][] grid) {
		System.out.println();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}

}
