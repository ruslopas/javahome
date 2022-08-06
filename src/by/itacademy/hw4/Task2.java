package by.itacademy.hw4;

import java.util.Scanner;

/*
  Найдите сумму и произведение цифр числа, введенного с клавиатуры.
 */

public class Task2 {

	public static void main(String[] args) {

		int input = enterNumber("Enter an integer : ");

		sumOfDigits(input);
		multiplyOfDigits(input);

	}

	public static int enterNumber(String msg) {

		System.out.print(msg);
		Scanner scanner = new Scanner(System.in);

		while (!scanner.hasNextInt()) {

			scanner.next();

			System.out.println("Error!!! Enter a number");

		}

		return scanner.nextInt();
	}

	public static void sumOfDigits(int input) {

		int sumResult = 0;

		for (int i = input; i > 0; i /= 10) {

			sumResult += (i % 10);
		}

		System.out.println("Sum of digits of number " + input + " = " + sumResult);

	}

	public static void multiplyOfDigits(int input) {

		if (input == 0) {
			int mult = 0;
			System.out.println("Multiplication of digits of number " + input + " = " + mult);
			
		} else {
			int mult = 1;

			for (int i = input; i > 0; i /= 10) {

				mult *= i % 10;
			}
			System.out.println("Multiplication of digits of number " + input + " = " + mult);

		}
	}
}