package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Divident Number");
		int A= scan.nextInt();
		System.out.println("Enter Divisor Number");
		int B=scan.nextInt();
		int dividend = A, divisor = B;

	    int quotient = dividend / divisor;
	    int remainder = dividend % divisor;

	    System.out.println("Quotient = " + quotient);
	    System.out.println("Remainder = " + remainder);
	}

}
