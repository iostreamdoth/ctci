package misc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Problem Statement

/* 1 2 3 4 5
 * 6 7 8 9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 * 
 * 
 * 
 * */

public class SmarkingInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] board = getboard(8,18);
		
		for(int x = 0; x<8;x++ )
		{
			for(int y=0; y<8;y++)
			{
				System.out.print( " ");
				System.out.print( board[x][y]);
			}
			System.out.println();
		}

	}
	public static int[][] getboard(int size, int mines)
	{
		// 0 for no mine and 1 for mine.
		int[][] board = new int[size][size];
		Random rn = new Random();
		
		//to get total number of elements
		int diff = size*size -1;
	    
		//to decide where to put the mines
		for(int index = 0;index<mines;index++){
			int mineindex = rn.nextInt(diff); // to generate a number between 0 and rows square
			//to get the row number of the random generated mine index and to get column of the random generated mine index
			mineindex = mineindex +1;
			System.out.println(mineindex/size);
			System.out.println(mineindex%size);
			
			//if same random number is generated again to keep on generating till a new number is found
			while(board[mineindex/size][mineindex%size] ==1)
			{
				mineindex = rn.nextInt(diff); 
				mineindex = mineindex +1;
			}
			board[mineindex/size][mineindex%size] = 1;
		}
	    
	    
		return board;
	}
}
