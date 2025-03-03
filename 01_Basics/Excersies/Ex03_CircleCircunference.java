package com.basics.examples;

import java.util.Scanner;

public class Ex03_CircleCircunference {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter circle radius: ");
		
		double radious = sc.nextDouble();
		double circleCircumference = 2 * Math.PI * radious;

		System.out.println("Circle circumference is: " + circleCircumference);
	}
}
