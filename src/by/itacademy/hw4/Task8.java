package by.itacademy.hw4;

import java.util.Arrays;

/*
 *    Отсортировать массив используя следующий алгоритм:
    • сортировки пузырьком
    • сортировки вставками
    • сортировки выборкой
 */
public class Task8 {

	public static void main(String[] args) {

		int[] sourceArray = { 12, -34, 4, 567, 12, -45, 23, 89, 35, -1 };
		System.out.println("My array");
		System.out.println(Arrays.toString(sourceArray));
		sortByBubble(sourceArray);
		sortByInsertion(sourceArray);
		sortBySelection(sourceArray);
	}

	public static void sortByBubble(int[] sourceArray) {

		System.out.println("Sorted by bubble array");

		boolean isSorted = false;
		int exchange;

		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < sourceArray.length - 1; i++) {
				if (sourceArray[i] > sourceArray[i + 1]) {
					isSorted = false;

					exchange = sourceArray[i];
					sourceArray[i] = sourceArray[i + 1];
					sourceArray[i + 1] = exchange;
				}

			}

		}
		System.out.println(Arrays.toString(sourceArray));
	}

	public static void sortByInsertion(int[] sourceArray) {

		System.out.println("Sorted by insertion");

		for (int left = 0; left < sourceArray.length; left++) {

			int value = sourceArray[left];
			int i = left - 1;
			for (; i >= 0; i--) {

				if (value < sourceArray[i]) {
					sourceArray[i + 1] = sourceArray[i];
				} else {

					break;
				}
			}

			sourceArray[i + 1] = value;
		}
		System.out.println(Arrays.toString(sourceArray));

	}

	public static void sortBySelection(int[] sourceArray) {

		System.out.println("Sorted by Selection");

		for (int i = 0; i < sourceArray.length; i++) {
			int min = sourceArray[i];
			int minId = i;
			for (int j = i + 1; j < sourceArray.length; j++) {
				if (sourceArray[j] < min) {
					min = sourceArray[j];
					minId = j;
				}
			}

			int temp = sourceArray[i];
			sourceArray[i] = min;
			sourceArray[minId] = temp;
		}
		System.out.println(Arrays.toString(sourceArray));
	}
}
