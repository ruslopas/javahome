package by.itacademy.hw2;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {

		int a;

		System.out.println("Введите целое число");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		scanner.close();

		evenNumberCheck(a);
	}

	public static void evenNumberCheck(int a) {

		boolean d = a % 2 == 0;
		String answer = d ? "Это четное число" : "Это нечетное число";
		System.out.println(answer);

	}

}
