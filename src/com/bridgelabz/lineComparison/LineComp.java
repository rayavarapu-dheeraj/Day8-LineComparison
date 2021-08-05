package com.bridgelabz.lineComparison;

import java.util.Scanner;

public class LineComp {

	static Scanner sc = new Scanner(System.in);

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

		System.out.println("Enter the values of next co-ordinates :");
		System.out.print("Enter the value of (x3,y3)= ");
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		System.out.print("Enter the value of (x4,y4)= ");
		int x4 = sc.nextInt();
		int y4 = sc.nextInt();

		double lengthOfLine2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

		System.out.println("Length of Line 1= " + lengthOfLine1);
		System.out.println("Length of Line2= " + lengthOfLine2);

		if (lengthOfLine1 == lengthOfLine2) {
			System.out.println("Two Lines are Equal");
		} else {
			System.out.println("Two Lines are Not Equal");
		}
	}
}
