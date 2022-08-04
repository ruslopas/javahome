package by.itacademy.hw2;

public class Task4 {

	public static void main(String[] args) {

		short s = 125;
		int i = 259;
		long l = 23245667L;
		float f = 25.98f;
		double d = 259.3456;
		char c = '#';

		narrowPrimType(d);
		narrowPrimType(l);
		narrowPrimType(f);
		narrowPrimType(i);
		narrowPrimType(s);
		narrowPrimType(c);

	}

//Преобразуем double в float,long и int
	public static void narrowPrimType(double d) {

		float f = (float) d;
		long l = (long) d;
		int i = (int) d;
		System.out.println("Преобразуем значение переменной " + d + " типа double в тип float -> " + f);
		System.out.println("Преобразуем значение переменной " + d + " типа double в тип long -> " + l);
		System.out.println("Преобразуем значение переменной " + d + " типа double в тип int -> " + i);

	}

	// Преобразуем long в int
	public static void narrowPrimType(long l) {

		int i = (int) l;
		System.out.println("Преобразуем значение переменной " + l + " типа long в тип int -> " + i);

	}

// Преобразуем float в int
	public static void narrowPrimType(float f) {

		int i = (int) f;
		System.out.println("Преобразуем значение переменной " + f + " типа float в тип int -> " + i);

	}

// Преобразуем int в short
	public static void narrowPrimType(int i) {

		short s = (short) i;
		System.out.println("Преобразуем значение переменной " + i + " типа int в тип short -> " + s);

	}

// Преобразуем short в byte
	public static void narrowPrimType(short s) {

		byte b = (byte) s;
		System.out.println("Преобразуем значение переменной " + s + " типа short в тип byte -> " + b);

	}

// Преобразуем char в int
	public static void narrowPrimType(char c) {

		int i = (int) c;
		System.out.println("Преобразуем значение переменной " + c + " типа char в тип int -> " + i);

	}
}
