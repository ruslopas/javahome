package by.itacademy.hw5.task2;

/*  Создайте класс Phone, который содержит переменные number, model и weight. 
Добавить в класс Phone методы: 
receiveCall, имеет один параметр – имя звонящего.Выводит на консоль сообщение “Звонит {name}”. 
getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. 
Метод выводит на консоль номера этих телефонов.
перегруженный  receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
Добавить конструкторы в класс Phone:
принимает на вход три параметра для инициализации переменных класса number, model и weight 
принимает на вход два параметра для инициализации переменных класса - number, model
без параметров
Создать объекты и продемонстрировать вызов методов.

*/
public class Main {

	public static void main(String[] args) {

		Phone poco = new Phone("Poco", 34567, 98);

		System.out.println(poco.getNumber());
		System.out.println();

		Phone samsung = new Phone("Samsung", 33333);

		System.out.println(samsung.getNumber());
		System.out.println();

		Phone jackPhone = new Phone();

		System.out.println(jackPhone.recieveCall("James"));
		System.out.println();

		Phone bob = new Phone();

		System.out.println(bob.recieveCall("Robert", 1234567));
		System.out.println();

		Phone sendMess = new Phone();

		System.out.println("Phone numbers to which the message will be sent");
		System.out.println(sendMess.sendMessage(11111, 22222, 33333, 44444, 55555));

	}
}
