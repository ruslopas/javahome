package by.itacademy.hw7.task3;

public class Apple extends Fruit {

	public Apple(String fruitName, double weight, double price) {
		super(fruitName, weight, price);

	}

	@Override
	public double priceOfFruit() {

		return this.getWeight() * this.getPrice();
	}

}
