package by.itacademy.hw4;

/*
 * Найти максимальный и минимальный элементы массива и вывести их индексы на экран.
 */

public class Task4 {

	public static void main(String[] args) {
		
		double[] myArray = new double[] { 1, 34, 2, -5, -67.8, -23, 0, -9.9, 3, 6 };
		
		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i] > myArray[maxIndex])
				maxIndex = i;
			else if (myArray[i] < myArray[minIndex]) {
				minIndex = i;
			}

		}
		System.out.println("Index of minimal variable value " + myArray[minIndex] + " is " + minIndex);
		System.out.println("Index of maximal variable value " + myArray[maxIndex] + " is " + maxIndex);
	}
}