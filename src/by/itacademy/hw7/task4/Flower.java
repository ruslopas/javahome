package by.itacademy.hw7.task4;

public abstract class Flower {

	private String color;
	private int lifeCycle;
	private double price;

	public Flower(String color, int lifeCycle, double price) {
		this.color = color;
		this.lifeCycle = lifeCycle;
		this.price = price;

	}

	public String getColor() {
		return color;
	}

	public int getLifeCycle() {
		return lifeCycle;
	}

	public double getPrice() {
		return price;
	}

	public int getAmount() {
		return 0;
	}

}
