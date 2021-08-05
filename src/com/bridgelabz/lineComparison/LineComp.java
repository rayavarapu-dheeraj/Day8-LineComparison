package com.bridgelabz.lineComparison;

import java.util.Scanner;

public class LineComp {

	static Scanner sc =new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Welcome to line Comparison:");
		System.out.println("Enter the value of co-ordinate:");
		System.out.print("Enter the value of (x1,y1)= :");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		System.out.print("Enter the value of (x2,y2)= :");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();

		double lengthOfLine1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.println("the length of the line is "+lengthOfLine1);
	}

}
