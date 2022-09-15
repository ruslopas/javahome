package by.itacademy.hw13.task2;
/*
 * Пользователь вводит с клавиатуры значения в массив,
 *  после чего запускаются два потока.
 *   Первый поток находит максимум в массиве, второй — минимум.
 *    Результаты вычислений возвращаются в метод main().
 */

public class Main {

    public static void main(String[] args) {

	int[] numbers = { 1, 24, 4, 7, -1, 24, -5 };

	ThreadMinMax t1 = new ThreadMinMax(numbers);
	ThreadMinMax t2 = new ThreadMinMax(numbers);

	try {

	    t1.getThread().join();
	    t2.getThread().join();
	} catch (InterruptedException e) {
	    System.out.println("Error.");
	}

	System.out.println("max = " + t1.getMax());
	System.out.println("min = " + t1.getMin());
    }

}
