package by.itacademy.hw8.task3;

public class Sneakers extends Shoes {

	private final String TYPE = "Sneakers";

	public Sneakers(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, size, price);

	}

	public String getType() {
		return TYPE;
	}

}
