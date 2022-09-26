package by.itacademy.hw13.task3;

public class MyThread extends Thread {

    private StringBuilder sb;

    public MyThread(StringBuilder sb) {
	this.sb = sb;
    }

    @Override
    public void run() {

	synchronized (sb) {
	    for (int i = 0; i < 100; i++) {
		System.out.print(sb);
	    }

	    System.out.println();
	    char ch = sb.charAt(0);
	    sb.setCharAt(0, ++ch);
	}
    }
}
