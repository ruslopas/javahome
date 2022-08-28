package by.itacademy.hw8.task3;

public class Boots extends Shoes {
	private static final String TYPE = "Boots";

	public Boots(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, size, price);

	}

	public static String getType() {
		return TYPE;
	}

}
