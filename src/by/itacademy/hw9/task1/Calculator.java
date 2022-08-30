package by.itacademy.hw9.task1;

public class Calculator {

	public static <T extends Number, V extends Number> void sum(T a, V b) {
		System.out.printf("Sum %s + %s = %s\n", a, b, a.doubleValue() + b.doubleValue());

	}

	public static <T extends Number, V extends Number> void multiply(T a, V b) {
		System.out.printf("Multiply %s x %s = %s\n", a, b, a.doubleValue() * b.doubleValue());
	}

	public static <T extends Number, V extends Number> void divide(T a, V b) {
		System.out.printf("Divide %s + %s = %s\n", a, b, a.doubleValue() / b.doubleValue());
	}

	public static <T extends Number, V extends Number> void subtraction(T a, V b) {
		System.out.printf("Subtraction %s + %s = %s\n", a, b, a.doubleValue() - b.doubleValue());
	}
}
