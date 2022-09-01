package by.itacademy.hw7.task3;

public class Pear extends Fruit {

	public Pear(String fruitName, double weight, double price) {
		super(fruitName, weight, price);

	}

	@Override
	public double priceOfFruit() {

		return this.getWeight() * this.getPrice();
	}

}
