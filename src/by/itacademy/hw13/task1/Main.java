package by.itacademy.hw13.task1;

public class Main {

    public static void main(String[] args) {

	Object obj = Thread2.getObject();

	try {
	    Thread thread1 = new Thread(new Thread1());
	    Thread thread2 = new Thread(new Thread2());

	    System.out.printf("-> %s\n", thread1.getState());
	    thread1.start();

	    System.out.printf("-> %s\n", thread1.getState());
	    thread2.start();

	    Thread.sleep(500);
	    System.out.printf("-> %s\n", thread1.getState());
	    System.out.printf("-> %s\n", thread2.getState());

	    synchronized (obj) {
		obj.notify();
	    }

	    System.out.printf("-> %s\n", thread2.getState());

	    Thread.sleep(2000);
	    System.out.printf("-> %s\n", thread1.getState());

	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
