package javaproject;

import java.util.Scanner;

public class Ifelse2 {
	public static void main(String[] args) {
//		nhập vào số tiền thuế (đơn vị là triệu đồng), và in ra kết quả:
//			- dưới 10M: không đóng thuế
//			- từ 10M tới 15M: thuế 10%
//			- từ 15 tới 30M : thuế 20%
//			- trên 30M: thuế 50%
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please your tax: ");

		int tax = scanner.nextInt();

		if (tax < 10) {
			System.out.println("Don't need");
		} else if (10 <= tax && tax <= 15) {
			System.out.println("Tax is 10%");
		} else if (15 <= tax && tax <= 30) {
			System.out.println("Tax is 20%");
		} else {
			System.out.println("Tax is 50%");
		}

		scanner.close();
	}
}
