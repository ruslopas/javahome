/*
 * Написать метод, который принимает на вход два целых числа,
 *  делает их суммирование и складывает результат с произведением двух этих чисел,
 *   и возвращает полученный результат из метода. Передать на вход в метод любые два числа.
 *    Вывести полученный результат работы метода на экран.
 */

package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		System.out.print("Введите первое число: ");
		long firstNumber = inputFromScanner();

		System.out.print("Введите второе число: ");
		long secondNumber = inputFromScanner();

		System.out.printf("\n(%s + %s) * (%s * %s) = %s\n", firstNumber, secondNumber, firstNumber, secondNumber,
				sumAndMultiply(firstNumber, secondNumber));
	}

	private static long sumAndMultiply(long firstNumber, long secondNumber) {

		return (firstNumber + secondNumber) + firstNumber * secondNumber;
	}

	private static long inputFromScanner() {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		while(!scanner.hasNextLong()) {
			System.out.println("Необходимо ввести целое число.\nПовторите пожалуйста ввод...");
			scanner.next();
		}

		return scanner.nextInt();

	}
}