package by.itacademy.hw6;
/*Введите строку (текст). 
 * Найдите наибольшее количество идущих подряд цифр.*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

	public static void main(String[] args) {

		System.out.println("Enter a string");
		String line = inputFromScanner();
		
		findConsecutiveDigits(line);

	}

	public static void findConsecutiveDigits(String line) {
		Pattern pattern = Pattern.compile("\\D+");
		Matcher matcher = pattern.matcher(line);
		String nums = matcher.replaceAll(" ");

		String[] num = nums.split("\\s+");

		int digit = 0;
		for (int i = 0; i < num.length; i++) {
			if (num[i].length() > digit) {
				digit = num[i].length();
			}
		}
		System.out.println("The largest number of consecutive digits : " + digit);

	}

	public static String inputFromScanner() {
		Scanner input = new Scanner(System.in);

		return input.nextLine();
	}
}
