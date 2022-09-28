package by.itacademy.hw16.task2;

import java.util.List;

/* Дана коллекция Collection<Integer> col. С помощью stream API:
         найти минимальное число
         найти максимальное число
         найти среднее арифметическое чисел
         найти произведение всех чисел
         найти сумму всех чисел
         найти сумму всех цифр
*/
public class Main {

    public static void main(String[] args) {

	CollectionService collection = new CollectionService();
	List<Integer> intNums = collection.getArrayList();

	System.out.print("Числа в коллекции : ");
	for (Integer i : intNums) {
	    System.out.print(i + " ");

	}

	System.out.printf("\nМаксимальное число : %s", collection.getMax(intNums));
	System.out.printf("\nМинимальное число : %s", collection.getMin(intNums));
	System.out.printf("\nПроизведение чисел : %s", collection.getMultiplication(intNums));
	System.out.printf("\nСреднее арифметическое : %.2f", collection.getAverage(intNums));
	System.out.printf("\nСумма чисел : %s", collection.getSum(intNums));
	System.out.printf("\nСумма цифр всех чисел коллекции : %s", collection.getSumOfDigits(intNums));
    }

}