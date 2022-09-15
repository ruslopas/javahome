package by.itacademy.hw13.task3;

/*
 * Создать три потока, которые изменяют один и тот же объект.
 *  Каждый поток должен вывести на экран цифру 100 раз,
 *   затем увеличить ее значение на 1.
 */
public class Main {

    public static void main(String[] args) {

	StringBuilder sb = new StringBuilder();
	sb.append(1);

	Thread thread1 = new MyThread(sb);
	Thread thread2 = new MyThread(sb);
	Thread thread3 = new MyThread(sb);

	thread1.start();
	thread2.start();
	thread3.start();

    }

}
