package com.core.java.variables;

public class MultiDimensional {

	
	/*
	Building this matrix 
	1 1 1 1 1      0,0 0,1 0,2 0,3
	1 1 1 1 1      1,0 1,1 1,2 1,3
	1 1 1 1 1      2,0 2,1 2,2 2,3
	1 1 1 1 1      3,0 3,1 3,2 3,3
	*/

	public static void main(String[] args) {
		int value = 1;
		buildMatrix(value, 4, 4);

		int val[][] = {
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1},
				{1,1,1,1}
		};
		
		System.out.println(val);
		System.out.println(value);
		//logger.info("current" , val)
	}

	private static void buildMatrix(int value, int row, int column) {
		int twoD[][] = new int[row][column];
		int r,c,k = 0;
		//Initializing
		for(r=0; r<row;r++) {
			for(c=0;c<column;c++) {
				twoD[r][c] = value;
			}
		}
		
		//Printing
		for(r=0; r<row;r++) {
			for(c=0;c<column;c++) {
				System.out.print(twoD[r][c] + " ");
			}
			System.out.println();
		}
	}

}
