package by.itacademy.hw15.task1;

class Consumer implements Runnable {
    Store store;

    Consumer(Store store) {
	this.store = store;
	new Thread(this, "Consumer").start();
    }

    public void run() {
	for (int i = 0; i < store.MAX_SIZE; i++)

	    store.get();

	System.out.println("The store is empty");
    }
}
