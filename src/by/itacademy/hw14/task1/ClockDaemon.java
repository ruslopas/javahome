package by.itacademy.hw14.task1;

import java.time.LocalDateTime;

public class ClockDaemon implements Runnable {

    int count;

    public ClockDaemon(int count) {
	this.count = count;

    }

    @Override
    public void run() {

	while (true) {
	    try {
		Thread.sleep(count * 1000);
		System.out.println(LocalDateTime.now());
	    } catch (InterruptedException e) {
		System.out.println(e.getMessage());

	    }
	}

    }

}
