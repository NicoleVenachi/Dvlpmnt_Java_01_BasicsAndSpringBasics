package com.basics.examples;

import java.util.Scanner;

public class Ex02_TriangleArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter A side of a triangle: ");
		double a = sc.nextDouble();
		
		System.out.print("Please, enter B side of a triangle: ");
		double b = sc.nextDouble();
	
		System.out.print("Please, enter C side of a triangle: ");
		double c = sc.nextDouble();
		
		if (a <= 0 || b <= 0 || c <= 0 || (a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("NaN");
        } else {
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.printf("The area of the triangle is: %.2f%n", area);
        }
	}
}
