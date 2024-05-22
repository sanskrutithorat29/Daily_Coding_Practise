package com.dailypractise;
public class While2Demo {
	public static void main(String[] args) {
		//even odd using while
		int i=0;
		while(i<=10){
			if(i%2==0)
			{
				System.out.println("Even numbers are:"+i);
				i++;
			}
		}
		while(i<=10)
		{
			if(i%2!=0)
			{
				System.out.println("Odd numbers are:"+i);
				i++;
			}
		}
	}

}
