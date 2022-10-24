package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

	int a, b, c;

	System.out.print("Введите первое число (а) -> ");
	a = inputFromScanner();

	System.out.print("Введите второе число (b) -> ");
	b = inputFromScanner();

	c = sumAndMultiply(a, b);
	System.out.printf("\n(a + b) * (a * b) = %s\n", c);
    }

    public static int sumAndMultiply(int a, int b) {

	return (a + b) + a * b;
    }

    public static int inputFromScanner() {
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
	
	return scanner.nextInt();

    }
}