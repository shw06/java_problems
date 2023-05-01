package com.edubridge;

public class Test8 {

	public static void main(String[] args) {
		//1st [] consider as row (outer loop)
		//2nd [] consider as column(inner loop)
		//jagged array-array within array(2 D)
		int arr[][]= {{1,2},{2,3,4},{0,0,1,2}};
		
		//print 2 D array
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}