package by.itacademy.hw4;

import java.util.Scanner;
/*
        Создайте программу, вычисляющую факториал натурального числа n,
        которое пользователь введёт с клавиатуры.
        1! = 1
        2! = 1 * 2
        3! = 1 * 2 * 3
        4! = 1 * 2 * 3 *4
 */

public class Task3 {

	public static void main(String[] args) {

		int input = enterNumber("Enter an integer : ");

		calculateFactorial(input);

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

	public static void calculateFactorial(int input) {

		if (input == 0) {
			System.out.println("0! = 1");
		} else if (input < 0) {
			System.out.println("Factorial cannot be negative.Try again");
		} else {

			long factorial = 1;
			for (int i = 1; i <= input; i++) {
				factorial *= i;

			}
			System.out.println(input + "! = " + factorial);
		}
	}
}