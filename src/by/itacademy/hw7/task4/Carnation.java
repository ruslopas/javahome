package by.itacademy.hw7.task4;

public class Carnation extends Flower {

	private String flowerName = "Carnation";
	private int amount;

	public Carnation(String color, int lifeCycle, double price, int amount) {
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
