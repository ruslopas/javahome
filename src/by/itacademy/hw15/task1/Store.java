package by.itacademy.hw15.task1;

import java.util.concurrent.Semaphore;

class Store {

    int item = 0;
    public final int MAX_SIZE = 15;

    static Semaphore semConsumer = new Semaphore(0);
    static Semaphore semProducer = new Semaphore(1);

    void put(int item) {
	try {
	    semProducer.acquire();
	} catch (InterruptedException e) {
	    System.out.println("InterruptedException caught");
	}

	this.item = item;

	System.out.println("Producer put item to store : " + item);

	semConsumer.release();
    }

    void get() {
	try {
	    semConsumer.acquire();

	} catch (InterruptedException e) {
	    System.out.println("InterruptedException caught");
	}

	System.out.println("Consumer buy item : " + item);

	semProducer.release();
    }

}
