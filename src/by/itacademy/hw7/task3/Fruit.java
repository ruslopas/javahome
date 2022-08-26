package by.itacademy.hw7.task3;

public abstract class Fruit {

	private double weight;
	private double price;
	private String fruitName;

	public Fruit(String fruitName, double weight, double price) {
		this.fruitName = fruitName;
		this.weight = weight;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void printManufacturerInfo() {
		System.out.println("Made in Belarus");
	}

	public abstract double priceOfFruit();
}
