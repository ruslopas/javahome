package by.itacademy.hw3;

import java.util.Scanner;

/*Передать на вход программы число от 0 до 59 
  (если оно не входит в диапазон, вывести сообщение об ошибке.).
    Определите в какую четверть часа попадает это число
     (в первую, вторую, третью или четвертую).
*/

public class Task5 {

    public static void main(String[] args) {

	System.out.print("Введите число от 0 до 59 ");

	defineQuarterOfHour(inputFromScanner());

    }

    public static void defineQuarterOfHour(int num) {

	if (num >= 0 && num <= 14) {
	    System.out.println("Число " + num + " попадает в первую четверть часа.");

	} else if (num >= 15 && num <= 29) {
	    System.out.println("Число " + num + " попадает во вторую четверть часа.");

	} else if (num >= 30 && num <= 44) {
	    System.out.println("Число " + num + " попадает в третью четверть часа.");

	} else if (num < 0 || num > 59) {
	    System.out.println("Число не входит в заданный диапазон");

	} else {
	    System.out.println("Число " + num + " попадает в четвертую четверть часа.");

	}

    }

    public static int inputFromScanner() {

	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	while (!scanner.hasNextInt()) {
	    System.out.println("Это не число");
	    scanner.nextInt();
	}

	return scanner.nextInt();

    }

}
