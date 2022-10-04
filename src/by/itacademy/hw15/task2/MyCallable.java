package by.itacademy.hw15.task2;

import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    private int sum;

    @Override
    public String call() {

	Random rnd = new Random();

	for (int i = 0; i < 10; i++) {
	    int number = rnd.nextInt(100);
	    sum += number;
	}

	try {
	    Thread.sleep(((rnd.nextInt(10) + 1)) * 1000);
	} catch (InterruptedException e) {
	    System.out.println(e.getMessage());
	}

	return "Sum of elements in current random collection is " + sum + ". Performed by "
		+ Thread.currentThread().getName();

    }

}