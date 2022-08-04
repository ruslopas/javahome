package by.itacademy.hw2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		double a, b, c;

		System.out.println("Введите первое число");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextDouble();

		System.out.println("Введите второе число");
		b = scanner.nextDouble();

		System.out.println("Введите третье число");
		c = scanner.nextDouble();
		scanner.close();

		if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
			System.out.println("Меньшее по модулю число " + a);

		} else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
			System.out.println("Меньшее по модулю число " + b);

		} else {
			System.out.println("Меньшее по модулю число " + c);

		}

	}
}
