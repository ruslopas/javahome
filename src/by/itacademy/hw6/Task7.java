package by.itacademy.hw6;

/*Практика методов классов оберток
• Создайте объекты класса Double, используя методы valueOf(). 
• Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
• Преобразовать объект класса Double ко всем примитивным типам.
• Вывести значение объекта Double на консоль. 
• Преобразовать литерал типа double к строке: String d = Double.toString(3.14);*/

public class Task7 {

	public static void main(String[] args) {

		Double number1 = Double.valueOf(0.12345);
		Double number2 = Double.valueOf("5.12345");

		System.out.println("Created objects 0f class Double :\n   " + number1 + "    " + number2 + "\n");
		System.out.println("Convert from String to double : " + convertFromStringToPrimDouble("5.123456789") + "\n");

		convertToPrimitive(number2);

		convertToString(3.1415926535);

	}

	public static double convertFromStringToPrimDouble(String value) {

		double d = Double.parseDouble(value);

		return d;
	}

	public static void convertToPrimitive(Double num2) {

		byte b = num2.byteValue();
		short s = num2.shortValue();
		int i = num2.intValue();
		long l = num2.longValue();
		float f = num2.floatValue();
		double d = num2.doubleValue();

		System.out.println("Convert to primitive types :\n" + "byte : " + b + "\nshort : " + s + "\nint : " + i
				+ "\nlong : " + l + "\nfloat : " + f + "\ndouble : " + d + "\n");

	}

	public static void convertToString(double pi) {

		String d = Double.toString(pi);

		System.out.println("Convert \"pi\" from double to String :\n" + "String d == " + d.getClass()
				+ "\nvalue of String d == " + d);

	}
}
