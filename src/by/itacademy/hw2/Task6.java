package by.itacademy.hw2;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {

		double a, b, c;

		System.out.println("Введите первое число");	
		a = inputFromScanner();

		System.out.println("Введите второе число");
		b = inputFromScanner();

		System.out.println("Введите третье число");
		c = inputFromScanner();
		
		findSmall(a, b, c);
	

	}
	
	public static double inputFromScanner() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		
		return a;
	}
	
	public static void findSmall(double a,double b,double c) {
	    
		if ((Math.abs(a)) < (Math.abs(b)) && (Math.abs(a)) < (Math.abs(c))) {
			System.out.println("Меньшее по модулю число " + a);

		} else if ((Math.abs(b)) < (Math.abs(a)) && (Math.abs(b)) < (Math.abs(c))) {
			System.out.println("Меньшее по модулю число " + b);

		} else {
			System.out.println("Меньшее по модулю число " + c);

		}
	    
	}
	
}
