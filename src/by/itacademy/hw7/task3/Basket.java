package by.itacademy.hw7.task3;

public class Basket {

	private Fruit[] basket;

	public Basket(Fruit[] basket) {
		this.basket = basket;
	}

	public void totalPrice() {
		double totalPrice = 0;
		System.out.println("Detailed report :\n");
		for (Fruit fruit : basket) {
			System.out.println("Product : \"" + fruit.getFruitName() + "\", Weight : " + fruit.getWeight() + " kg"
					+ ", Price : " + String.format("%.2f", fruit.priceOfFruit()) + "$");
			totalPrice = totalPrice + fruit.priceOfFruit();
		}
		System.out.println("\nTotal price is : " + String.format("%.2f", totalPrice) + "$");
	}
}
