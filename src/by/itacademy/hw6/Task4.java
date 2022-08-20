package by.itacademy.hw6;

import java.util.Scanner;

/*
 * Решить задачу с помощью класса StringBuilder
    • Дано два числа, например 3 и 56, необходимо составить следующие строки: 
	3 + 56 = 59 
	3 – 56 = -53 
	3 * 56 = 168.
    • Замените символ “=” на слово “равно”.
 */

public class Task4 {

	public static void main(String[] args) {

		System.out.println("Enter first number :");
		int firstNumber = inputFromScanner();
		System.out.println("Enter second number :");
		int secondNumber = inputFromScanner();

		StringBuilder sum = new StringBuilder();
		StringBuilder multiply = new StringBuilder();
		StringBuilder subtraction = new StringBuilder();

		System.out.println(sum.append(firstNumber).append(" + ").append(secondNumber).append(" = ")
				.append(firstNumber + secondNumber));
		System.out.println(multiply.append(firstNumber).append(" * ").append(secondNumber).append(" = ")
				.append(firstNumber * secondNumber));
		System.out.println(subtraction.append(firstNumber).append(" - ").append(secondNumber).append(" = ")
				.append(firstNumber - secondNumber));

		replaceEqual(sum, "=", "equals");
		replaceEqual(multiply, "=", "equals");
		replaceEqual(subtraction, "=", "equals");

	}

	public static void replaceEqual(StringBuilder strBil, String oldStr, String newStr) {
		System.out.println(strBil.replace(strBil.indexOf(oldStr), strBil.indexOf(oldStr) + oldStr.length(), newStr));

	}

	public static int inputFromScanner() {
		Scanner input = new Scanner(System.in);
		while (!input.hasNextInt()) {
			System.out.println("Error!!! This is not a number.Try again");
			input.nextLine();
		}

		return input.nextInt();
	}

}
