package by.itacademy.hw7.task4;
/*
 * Реализовать иерархию цветов (розы, ромашки и т.п.).
    • Создать несколько объектов-цветов.
    • Собрать букет и определить его стоимость.
    • Определить все цвета, используемые в букете.
    • Определить когда весь букет завянет.
 */

public class Main {

	public static void main(String[] args) {

		Rose rose = new Rose("red", 3, 1, 5);
		Rose rose2 = new Rose("white", 4, 1.5, 4);
		Rose rose3 = new Rose("pink", 3, 1.25, 4);
		Chamomile chamomile = new Chamomile("white", 5, 1, 1);
		Carnation carnation = new Carnation("red", 3, 1.5, 7);

		Bouquet bouquet = new Bouquet(new Flower[] { rose, rose2, rose3, chamomile, carnation });

		System.out.println("Total amount of flowers : " + bouquet.getTotalReport() + " $\n");
		System.out.println("Total life lenght of the bouquet : " + bouquet.getLifeCycle() + " days\n");
		System.out.println("Colors of the bouquet : " + bouquet.getFlowerColors());
	}

}
