package by.itacademy.hw4;

/*
 * Найти минимальный из элементов массива с нечетными индексами.
 */

public class Task5 {

	public static void main(String[] args) {
		double[] myArray = new double[] { 1, 34, 2, -5, -67.8, 23, 0, -9.9, 3, 6 };
		System.out.println("myArray");

		for (double x : myArray) {
			System.out.print(x + " ");
		}
		System.out.println("");

		int minIndex = 1;
		double varValue = myArray[0];

		for (int i = 0; i < myArray.length; i++) {

			if (i % 2 != 0 && myArray[i] < varValue) {

				minIndex = i;
				varValue = myArray[i];
			}

		}
		System.out.println("Index of minimal odd variable value " + varValue + " is " + minIndex);

	}
}
