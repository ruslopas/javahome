package by.itacademy.hw8.task3;

public class Sweater extends Clothes {
	private static final String TYPE = "Sweater";

	public Sweater(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, size, price);

	}

	public static String getType() {
		return TYPE;
	}

}
