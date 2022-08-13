

package by.itacademy.hw5.task3;
/*
  Создать класс "Матрица". Класс должен иметь следующие переменные:
    • двумерный массив вещественных чисел;
    • количество строк и столбцов в матрице.
  Класс должен иметь следующие методы:
    • сложение с другой матрицей;
    • умножение на число;
    • вывод на печать; 
    • умножение матриц.
  Продемонстрируйте работу методов класса.
  */

public class Matrix {

	// Fields

	private int rowsQuantity = 2;
	private int columnsQuantity = 2;
	private int[][] matrix = new int[rowsQuantity][columnsQuantity];

	// Methods

	public void fillRandom() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 20 - 10);

			}

		}

	}

	public void printArray() {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");

			}
		}
	}

}

