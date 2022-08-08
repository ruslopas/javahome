package by.itacademy.hw4;


import java.util.Arrays;

/*
 * Разложить положительные и отрицательные числа по разным массивам.
 */
public class Task6 {

	public static void main(String[] args) {
		
		int[] sourceArray = { -3, 4, -2345, -6, -234, -2, 54, 78, 100, 3 };
		int positive = 0;
		int negative = 0;

		System.out.println("Source Array\n" + Arrays.toString(sourceArray));
		
		for (int x : sourceArray) {
			if (x > 0) {
				positive++;
			} else {
				negative++;
			}
		}

		int[] positiveArray = new int[positive];
		int[] negativeArray = new int[negative];

		int countPositive = 0;
		int countNegative = 0;

		for (int j : sourceArray) {
			if (j > 0) {
				positiveArray[countPositive] = j;
				countPositive++;
			} else {
				negativeArray[countNegative] = j;
				countNegative++;
			}

		}
		System.out.println("Positive Array\n" + Arrays.toString(positiveArray));
		System.out.println("Negative Array\n" + Arrays.toString(negativeArray));
	}
}
