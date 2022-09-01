package by.itacademy.hw7.task4;

public class Chamomile extends Flower {

	private String flowerName = "Chamomile";
	private int amount;

	public Chamomile(String color, int lifeCycle, double price, int amount) {
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
