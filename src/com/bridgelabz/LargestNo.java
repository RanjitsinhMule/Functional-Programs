package com.bridgelabz;

import java.util.Scanner;

public class LargestNo {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first Number");
		double n1 = scan.nextDouble();
		System.out.println("Enter the first Number");
		double n2 = scan.nextDouble();
		System.out.println("Enter the first Number");
		double n3 = scan.nextDouble();
		
		//double n1 = -4.5, n2 = 3.9, n3 = 2.5;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
	}

}
