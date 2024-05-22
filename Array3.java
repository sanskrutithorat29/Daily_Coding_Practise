package com.dailypractise;

public class Array3 {
	//ways to print array
	
//	//way 1:
//	public static void main(String args[])
//	{
//		System.out.println("Way 1:");
//		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println(" ");
//		}
//
//	}
	
	
//	//way 2
//	public static void main(String args[])
//	{
//		System.out.println("Way 2: ");
//		int [][][] a= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}},{{13,14,15},{16,17,18}}};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				for(int k=0;k<a[i][j].length;k++)
//				{
//					 System.out.print(a[i][j][k] + " ");
//				}
//				System.out.println();
//			}
//			System.out.println();
//		}
//		
//	}
	
	
	//way 3
//	public static void main(String args[]) {
//		int a[]= {10,20,30};
//		int i=0;
//		do {
//			System.out.println(a[i]);
//			i++;
//		}
//		while(i<a.length);
//		
//	}
	
	//way 4
	public static void main(String args[]) {
		int a[]= {10,20,30};
		for(int i:a)
		{
			System.out.println(i);
		}
	}
}
