package javaproject;

import java.util.Scanner;

public class Exercise2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter length: ");
		Float length = scanner.nextFloat();

		System.out.println("Please enter width: ");
		Float width = scanner.nextFloat();

		Float perimeter = (length + width) * 2;

		Float area = length * width;

		Float leastValue = Math.min(length, width);

		System.out.println("Perimeter of rectangle: " + perimeter);
		System.out.println("Area of rectangle: " + area);
		System.out.println("Smallest edge of rectangle: " + leastValue);

		scanner.close();
	}
}
