package by.itacademy.hw3;

import java.util.Scanner;

/*
Пользователь вводит два целых однозначных числа.
Программа задаёт вопрос: результат умножения первого числа на второе.
 Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
  Если нет  – показать еще и правильный результат.
*/

public class Task7 {
	
    public static void main(String[] args) {

	System.out.print("Введите первое целое число : ");
	int a = inputFromScanner();

	System.out.print("Введите второе целое число : ");
	int b = inputFromScanner();

	verifyMultiplication(a, b);

    }

    public static void verifyMultiplication(int a, int b) {

	System.out.print("Введите ответ " + a + " * " + b + " = ");
	int c = inputFromScanner();

	if (c == a * b) {
	    System.out.println("Правильно");
	} else {
	    System.out.println("Неправильно.Правильный ответ : " + (a * b));
	}
    }

    public static int inputFromScanner() {

	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	return scanner.nextInt();

    }
}
