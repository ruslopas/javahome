package by.itacademy.hw8.task3;

public class Jacket extends Clothes {

	private final String TYPE = "Jacket";

	public Jacket(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, size, price);

	}

	public String getType() {
		return TYPE;
	}

}
