package by.itacademy.hw15.task1;

/*
 * Реализуйте классы Store, Producer, Consumer c помощью 
 * java.util.concurrent.Semaphore. Производитель, помещает
 *  товары в магазин, потребитель -  покупает.
 *   Размер магазина определяется переменной MAX_SIZE.
 */
public class Main {

    public static void main(String[] args) {

	Store store = new Store();

	new Consumer(store);
	new Producer(store);

    }

}
