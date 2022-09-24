package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    int sum;

    @Override
    public String call() {

	Random rnd = new Random();
	List<Integer> numbers = new ArrayList<>();

	for (int i = 0; i < 10; i++) {
	    numbers.add(rnd.nextInt(100));
	}

	for (Integer nums : numbers) {
	    sum += nums;
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