package by.itacademy.hw8.task3;

public class Boots extends Shoes {

	private final String TYPE = "Boots";

	public Boots(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, size, price);

	}

	public String getType() {
		return TYPE;
	}

}
