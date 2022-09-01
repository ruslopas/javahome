package by.itacademy.hw7.task4;

public class Rose extends Flower {

	private String flowerName = "Rose";
	private int amount;

	public Rose(String color, int lifeCycle, double price, int amount) {
		super(color, lifeCycle, price);
		this.amount = amount;
	}

	public String getFlowerName() {
		return flowerName;
	}

	@Override
	public int getAmount() {
		return amount;
	}
}
