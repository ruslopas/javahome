package by.itacademy.hw7.task4;

public class Bouquet {

	private Flower[] flowers;

	public Bouquet(Flower[] flowers) {
		this.flowers = flowers;

	}

	public void totalReport() {
		double totalAmount = 0;
		int totalLifeCycle = flowers[0].getLifeCycle();
		for (int i = 0; i < flowers.length; i++) {
			if (totalLifeCycle < flowers[i].getLifeCycle()) {
				totalLifeCycle = flowers[i].getLifeCycle();
			}
			totalAmount += flowers[i].getAmount() * flowers[i].getPrice();

		}

		StringBuilder colors = new StringBuilder(flowers[0].getColor());

		for (int i = 1; i < flowers.length; i++) {
			colors.append(" ").append(flowers[i].getColor()).append(" ");

		}
		System.out.println("Total amount of flowers : " + totalAmount + " $\n");
		System.out.println("Total life lenght of the bouquet : " + totalLifeCycle + " days\n");
		System.out.println("Colors of the bouquet : " + colors);
	}
}