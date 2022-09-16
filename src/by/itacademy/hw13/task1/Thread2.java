package by.itacademy.hw13.task1;

public class Thread2 implements Runnable {

    private static Object obj = new Object();

    public static Object getObject() {
	return obj;
    }

    @Override
    public void run() {
	try {

	    synchronized (obj) {
		obj.wait();
	    }
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
    }
}
