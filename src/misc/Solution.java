package misc;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	public static class Bitmap {
		private int[][] mColors;

		public Bitmap(int width, int height) {
			mColors = new int[width][height];
		}

		public int getPixel(int x, int y) {
			return mColors[x][y];
		}

		public void setPixel(int x, int y, int color) {
			mColors[x][y] = color;
		}

		public int getWidth() {
			return mColors.length;
		}

		public int getHeight() {
			if (mColors.length == 0) {
				return 0;
			}

			return mColors[0].length;
		}

		public void printBitmap() {
			int width = getWidth();
			int height = getHeight();
			for (int j = 0; j < height; j++) {
				for (int i = 0; i < width; i++) {
					System.out.print(getPixel(i, j) + " ");
				}

				System.out.println("");
			}
		}
	}

	public static Bitmap fillWithColor(Bitmap source, int x, int y, int color) {
        int width = source.getWidth();
		int height = source.getHeight();
		int oldcolor = source.getPixel(x, y);
		if(oldcolor == color)
		{
			return source;
		}
		source.setPixel(x, y, color);
		if (x - 1 > -1) {
			if (source.getPixel(x - 1, y) == oldcolor) {
				fillWithColor(source, x - 1, y, color);
			}
		}
		if (x + 1 < height-1) {
			if (source.getPixel(x + 1, y) == oldcolor) {
				fillWithColor(source, x + 1, y, color);
			}
		}
		if (y - 1 > -1) {
			if (source.getPixel(x, y - 1) == oldcolor) {
				fillWithColor(source, x, y - 1, color);
			}
		}
		if (y + 1 < width -1) {
			if (source.getPixel(x , y + 1) == oldcolor) {
				fillWithColor(source, x, y + 1, color);
			}
		}	
		return source;
    }
	public static Bitmap fillReplaceWithColor(Bitmap source, int x, int y,
			int color, int replacecolor) {
		int width = source.getWidth();
		int height = source.getHeight();
		int oldcolor = source.getPixel(x, y);

		return null;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int color = 1;
		System.out.println("Filling color: " + color + " at " + x + "," + y);

		int width = 3;
		int height = 3;
		Bitmap input = new Bitmap(width, height);

		for (int j = 0; j < height; j++) {
			for (int i = 0; i < width; i++) {
				input.setPixel(i, j, sc.nextInt());
			}
		}

		System.out.println("--Input--");
		input.printBitmap();

		System.out.println("--Output--");
		Bitmap output = fillWithColor(input, x, y, color);
		output.printBitmap();

		if (input == output) {
			System.out.println("Error: Same bitmap used!");
		}
	}
}