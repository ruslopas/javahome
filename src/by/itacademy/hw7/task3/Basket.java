package by.itacademy.hw7.task3;

public class Basket {

	private Fruit[] basket;

	public Basket(Fruit[] basket) {
		this.basket = basket;
	}

	public double totalPrice() {
		double basketPrice = 0;
		for (Fruit fruit : basket) {
			basketPrice = basketPrice + fruit.priceOfFruit();
		}
		return basketPrice;
	}

	public void detailedPrice() {
		for (Fruit fruit : basket) {
			System.out.println("Product : \"" + fruit.getFruitName() + "\", Weight : " + fruit.getWeight() + " kg"
					+ ", Price : " + String.format("%.2f", fruit.priceOfFruit()) + "$");

		}

	}
}