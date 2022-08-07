package by.itacademy.hw4;

/*
 * Создать массив заполнить его случайными элементами, распечатать,
 * перевернуть, и снова распечатать
 */
public class Task7 {

	public static void main(String[] args) {

		int arrayIndex = 10;
		int[] myArray = new int[arrayIndex];
		System.out.println("Created array");

		for (int i = 0; i < arrayIndex; i++) {
			myArray[i] = (int) (Math.random() * 100 + 1);
			System.out.print(" " + myArray[i]);
		}
		for (int i = 0; i < arrayIndex / 2; i++) {
			int exchange = myArray[i];
			myArray[i] = myArray[arrayIndex - 1 - i];
			myArray[arrayIndex - 1 - i] = exchange;

		}
		
		System.out.println();
		System.out.println("Reversed array");

		for (int i = 0; i < arrayIndex; i++) {
			System.out.print(" " + myArray[i]);
		}

	}

}
