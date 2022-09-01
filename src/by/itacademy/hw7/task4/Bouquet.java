package by.itacademy.hw7.task4;

public class Bouquet {

	private Flower[] flowers;

	public Bouquet(Flower[] flowers) {
		this.flowers = flowers;

	}

	public int getTotalReport() {
		int totalAmount = 0;
		for (int i = 0; i < flowers.length; i++) {
			totalAmount += flowers[i].getAmount() * flowers[i].getPrice();
		}
		return totalAmount;
	}

	public String getFlowerColors() {
		String colors = " ";
		for (int i = 0; i < flowers.length; i++) {
			if (!colors.contains(flowers[i].getColor())) {
				colors = colors.concat(flowers[i].getColor()).concat(" ");

			}

		}

		return colors;
	}

	public int getLifeCycle() {
		int totalLifeCycle = 0;
		for (int i = 0; i < flowers.length; i++) {
			if (totalLifeCycle < flowers[i].getLifeCycle()) {
				totalLifeCycle = flowers[i].getLifeCycle();
			}
		}
		return totalLifeCycle;
	}
}