package by.itacademy.hw13.task1;

public class Thread1 implements Runnable {

    @Override
    public void run() {

	try {
	    Thread.sleep(1000);
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
