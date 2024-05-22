package com.dailypractise;
import java.util.*;
public class Exception6 {
	/*
	 * Division with Multiple Catch Blocks: 
	 * Write a program that prompts the user to
	 * input two integers and then divides them. 
	 * Use nested try-catch blocks to handle the following cases:
	 * Division by zero Input mismatch (if the user enters a non-integer value)
	 */
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter first number: ");
	            int num1 = sc.nextInt();
	            
	            try {
	                System.out.print("Enter the divisor: ");
	                int num2 = sc.nextInt();
	                
	                try {
	                    int result = num1/num2;
	                    System.out.println("Result of division: " + result);
	                } catch (ArithmeticException e) {
	                    System.out.println("Error: Division by zero is not allowed!");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Error: Please enter an integer value for the divisor.");
	            }
	        } catch (InputMismatchException e) {
	            System.out.println("Error: Please enter an integer value for the dividend.");
	        } finally {
	        	sc.close();
	        }
	    }
	    
	 
}
