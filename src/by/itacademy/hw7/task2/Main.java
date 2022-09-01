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

		Converter FahrenheitConvert  = new FahrenheitConvert(celsiusDegree);
		System.out.printf("Fahrenheit degrees : %.2fF\n", FahrenheitConvert.convertFromCelsius(celsiusDegree));

		Converter KelvinConvert  = new KelvinConvert(celsiusDegree);
		System.out.printf("Kelvin degrees : %.2fK", KelvinConvert.convertFromCelsius(celsiusDegree));

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
