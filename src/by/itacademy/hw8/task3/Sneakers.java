package by.itacademy.hw8.task3;

public class Sneakers extends Shoes {
	private static final String TYPE = "Sneakers";

	public Sneakers(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, size, price);

	}

	public static String getType() {
		return TYPE;
	}

}
