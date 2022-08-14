package by.itacademy.hw5.task1;

/*
 *Создать класс Person, который содержит: переменные fullName, age;
 *методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит". 
 *Добавьте два конструктора  - Person() и Person(fullName, age).
 *Создайте два объекта этого класса. Один объект инициализируется конструктором Person(),
 *другой - Person(fullName, age). Продемострируйте работу методов.
 */

public class Main {

	public static void main(String[] args) {

		Person bob = new Person();
		Person jack = new Person("James", 25);

		System.out.println(bob.move());
		System.out.println(bob.talk());

		System.out.println();

		System.out.println(jack.move());
		System.out.println(jack.talk());

	}

}
