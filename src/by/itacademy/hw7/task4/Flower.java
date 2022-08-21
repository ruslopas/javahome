package by.itacademy.hw7.task4;

public abstract class Flower {

	private String color;
	private int lifeCycle;
	private double price;
	private int amount;

	public Flower(String color, int lifeCycle, double price, int amount) {
		this.color = color;
		this.lifeCycle = lifeCycle;
		this.price = price;
		this.amount = amount;
	}

	public String setColor() {
		return this.color = color;
	}

	public int setLifeCycle() {
		return this.lifeCycle = lifeCycle;
	}

	public double setPrice() {
		return this.price = price;
	}

	public int setAmount() {
		return this.amount = amount;
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
		return amount;
	}
}
