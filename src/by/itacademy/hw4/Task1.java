package by.itacademy.hw4;

/*
Необходимо вывести на экран таблицу умножения от 1 до 10.
*/

public class Task1 {

    public static void main(String[] args) {

	System.out.println("Multiplication table");

	int[][] myArray = new int[11][11];

	for (int i = 0; i < myArray.length; i++) {
	    for (int j = 0; j < myArray.length; j++) {
		myArray[i][j] = i * j;
		System.out.print(myArray[i][j] + " ");
	    }

	    System.out.println();
	}

    }

}
