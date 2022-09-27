package by.itacademy.hw15.task1;

class Producer implements Runnable {
    Store store;

    Producer(Store store) {
	this.store = store;
	new Thread(this, "Producer").start();
    }

    public void run() {
	System.out.printf("There is %s items in stock\n", store.MAX_SIZE);
	for (int i = 0; i < store.MAX_SIZE; i++)

	    store.put(i);

    }
}