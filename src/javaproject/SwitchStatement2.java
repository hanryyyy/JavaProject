package javaproject;

import java.util.Scanner;

public class SwitchStatement2 {
	public static void main(String[] args) {
		System.out.println(">> Option Features <<");
		System.out.println("++ ------------------ ++");
		System.out.println("| 1. + |");
		System.out.println("| 2. - |");
		System.out.println("| 3. Exits |");
		System.out.println("++ ------------------ ++");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please tell me, your option is ");
		int value = scanner.nextInt();

		switch (value) {
		case 1:
			System.out.println("You choose + ");
			break;
		case 2:
			System.out.println("You choose -");
			break;
		default:
			System.out.println("You choose exit programming ");
			System.exit(0);
		}
		System.out.println("Hello");
		scanner.close();
	}
}
