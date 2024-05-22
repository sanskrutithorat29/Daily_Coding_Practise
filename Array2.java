package com.dailypractise;

public class Array2 {
	public static void main(String[] args) {
		//jagged array
		int[][] a= {{1,2,3},{5,6},{7,8,9,10}};
		
//		System.out.println(a);
//		System.out.println(a[0]);
//		System.out.println(a[0][0]);
//		System.out.println(a.length);
//		System.out.println(a[0].length);
//		//System.out.println(a[0][0].length);//error
		
		
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println(" ");
	}
	}

}
