package by.itacademy.hw15.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String args[]) {

	ExecutorService executor = Executors.newFixedThreadPool(3);

	List<Future<String>> list = new ArrayList<>();
	Callable<String> callable = new MyCallable();

	for (int i = 0; i < 10; i++) {
	    Future<String> future = executor.submit(callable);
	    list.add(future);
	}

	for (Future<String> fut : list) {
	    try {
		System.out.println(fut.get());
	    } catch (InterruptedException | ExecutionException e) {
		System.out.println(e.getMessage());
	    }
	}

	executor.shutdown();
    }

}
