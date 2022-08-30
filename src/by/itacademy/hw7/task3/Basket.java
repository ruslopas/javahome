package by.itacademy.hw7.task3;

public class Basket {

	private Fruit[] basket;

	public Basket(Fruit[] basket) {
		this.basket = basket;
	}

	public double totalPrice() {
		double basketPrice = 0;
		for (Fruit fruit : basket) {
			basketPrice += fruit.priceOfFruit();
		}
		return basketPrice;
	}

	public void detailedPrice() {
		for (Fruit fruit : basket) {
			System.out.printf("Product : \"%s\". Weight : %.2f kg. Price : %.2f $. \n", fruit.getFruitName(),
					fruit.getWeight(), fruit.priceOfFruit());

		}

	}
}