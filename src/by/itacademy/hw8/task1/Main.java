package by.itacademy.hw8.task1;

public class Main {
	/*
	 * Создать интерфейс Cookable, содержащий метод void cook(String str). Создать
	 * класс Food, содержащий метод public void prepare(Cookable c, String str) {
	 * c.cook(str);} Создать экземпляр класса Food и вызвать его метод prepare(). На
	 * вход метода prepare() передать экземпляр анонимного класса, расширяющего
	 * интерфейс Cookable.
	 */
	public static void main(String[] args) {
		
		Food food = new Food();
		Cookable salad = new Cookable() {
			@Override
			public void cook(String str) {
				System.out.println(str);

			}
		};

		Cookable soup = new Cookable() {
			@Override
			public void cook(String str) {
				System.out.println(str);

			}
		};

		food.prepare(salad, "Salad");
		food.prepare(soup, "Soup");
	}
}