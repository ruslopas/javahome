package by.itacademy.hw14.task2;

/*
 * Пять безмолвных философов сидят вокруг круглого стола, перед каждым философом стоит тарелка спагетти. 
 * Вилки лежат на столе между каждой парой ближайших философов. Каждый философ может либо есть,
 * либо размышлять. Философ может есть только тогда, когда держит две вилки — взятую справа и слева. 
 * Реализовать программу содержащую пять потоков-философов, каждый из которых не должен остаться голодным.
 */
public class Main {

    public static void main(String[] args) {

	Fork[] forks = new Fork[] { new Fork(), new Fork(), new Fork(), new Fork(), new Fork() };

	Thread t1 = new Thread(new Philosopher(forks[4], forks[0]));
	t1.setName("Сократ");
	
	Thread t2 = new Thread(new Philosopher(forks[0], forks[1]));
	t2.setName("Кант");
	
	Thread t3 = new Thread(new Philosopher(forks[2], forks[1]));
	t3.setName("Конфуций");
	
	Thread t4 = new Thread(new Philosopher(forks[2], forks[3]));
	t4.setName("Гегель");
	
	Thread t5 = new Thread(new Philosopher(forks[4], forks[3]));
	t5.setName("Пифагор");

	t1.start();
	t2.start();
	t3.start();
	t4.start();
	t5.start();
    }
}
