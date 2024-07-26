package javaproject;

import java.util.Scanner;

public class Exercise1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);// declare

		System.out.println("Please enter student name: ");
		String studentName = scanner.nextLine();

		System.out.println("Please enter your score: ");
		Float score = scanner.nextFloat();

		System.out.println("Student name is " + studentName + " has score " + score);
		scanner.close();
	}
}
