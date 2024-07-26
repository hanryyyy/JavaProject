package javaproject;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("PLease edge of cube: ");
		Double edge = scanner.nextDouble();

		Double volume = Math.pow(edge, 3);

		System.out.println("Volume of cube: " + volume);

		scanner.close();
	}
}
