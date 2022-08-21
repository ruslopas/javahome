package by.itacademy.hw7.task2;

import java.util.Scanner;
/*
   Напишите классы для конвертации из градусов по Цельсию в
   Кельвины​ и ​Фаренгейты​.
 */

public class Main {

	public static void main(String[] args) {

		System.out.println("Enter temperature in Celsius degrees :");
		double celsiusDegree = inputCelsiusDegree();

		ConvertFromCelcius convertion = new ConvertFromCelcius(celsiusDegree);
		System.out.println(convertion.getConvertionInfo());

	}

	public static double inputCelsiusDegree() {

		Scanner input = new Scanner(System.in);
		while (!input.hasNextDouble()) {
			System.out.println("Error!!!Try again.");
			input.nextLine();

		}

		return input.nextDouble();

	}
}
