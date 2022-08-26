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

		FahrenheitConvert convertion = new FahrenheitConvert(celsiusDegree);
		System.out.println("Fahrenheit degrees : " + String.format("%.2f", convertion.convertFromCelsius()));

		KelvinConvert convertion2 = new KelvinConvert(celsiusDegree);
		System.out.println("Kelvin degrees : " + String.format("%.2f", convertion2.convertFromCelsius()));

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
