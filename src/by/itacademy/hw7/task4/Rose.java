package by.itacademy.hw7.task4;

public class Rose extends Flower {

	private String flowerName = "Rose";

	public Rose(String color, int lifeCycle, double price, int amount) {
		super(color, lifeCycle, price, amount);
		this.flowerName = flowerName;
	}

	public String getFlowerName() {
		return flowerName;
	}
}
