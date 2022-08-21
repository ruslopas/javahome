package by.itacademy.hw7.task3;

public class Apricot extends Fruit {

	public Apricot(String fruitName, double weight, double price) {
		super(fruitName, weight, price);

	}

	@Override
	public double priceOfFruit() {

		return this.getWeight() * this.getPrice();
	}

}
