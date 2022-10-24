package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

	System.out.println("Введите длины сторон треугольника");

	System.out.print("Введите длину первой стороны : ");
	double a = inputFromScanner();

	System.out.print("Введите длину второй стороны : ");
	double b = inputFromScanner();

	System.out.print("Введите длину третьей стороны : ");
	double c = inputFromScanner();

	checkTriangle(a, b, c);
    }

    public static void checkTriangle(double a, double b, double c) {

	if (a + b > c && b + c > a && c + a > b) {
	    System.out.println("Такой треугольник существует");

	} else {
	    System.out.println("Такой треугольник не существует");
	}
    }

    public static double inputFromScanner() {

	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);

	return scanner.nextDouble();

    }

}
