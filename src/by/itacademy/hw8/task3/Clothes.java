package by.itacademy.hw8.task3;

public class Clothes extends Product {
	private String size;

	public Clothes(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, price);
		this.size = size;
	}

	public String getSize() {
		return size;
	}

}
