package by.itacademy.hw8.task3;

public class Shoes extends Product {

	private String size;

	public Shoes(String color, String manufacturer, String size, double price) {
		super(color, manufacturer, price);
		this.size = size;
	}

	public String getSize() {
		return size;
	}
}
