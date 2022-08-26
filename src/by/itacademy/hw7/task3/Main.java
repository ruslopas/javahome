package by.itacademy.hw7.task3;
/*
 * Класс Фрукт содержит: 
    • переменную вес, 
    • метод printManufacturerInfo(){System.out.print("Made in Belarus");}
    • абстрактный метод, возвращающий стоимость фрукта. Метод должен учитывать вес.
   Собрать корзину из яблок, груш и абрикосов. Подсчитать ее общую стоимость и общую стоимость по каждому виду фрукта.
 */

public class Main {

	public static void main(String[] args) {

		Apple apple = new Apple("Apple", 2.5, 5);
		Pear pear = new Pear("Pear", 2.1, 3.15);
		Apricot apricot = new Apricot("Apricot", 1.25, 1.2);

		Basket basket = new Basket(new Fruit[] { apple, pear, apricot });

		System.out.println("Detailed report :\n");
		basket.detailedPrice();

		System.out.println("\nTotal price is : " + String.format("%.2f", basket.totalPrice()) + "$");

	}

}
