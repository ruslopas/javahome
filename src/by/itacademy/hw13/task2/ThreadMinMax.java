package by.itacademy.hw13.task2;

class ThreadMinMax implements Runnable {

    private Thread thread;
    private int[] numbers;
    private int maximum;
    private int minimum;

    public ThreadMinMax(int[] nums) {

	numbers = nums;

	thread = new Thread(this, "Thread1.");
	thread.start();
    }

    public void run() {

	int max = numbers[0];
	int min = numbers[0];

	for (int i = 1; i < numbers.length; i++) {
	    if (max < numbers[i]) {
		max = numbers[i];
	    }

	    if (min > numbers[i]) {
		min = numbers[i];
	    }

	}
	maximum = max;
	minimum = min;
    }

    public Thread getThread() {
	return thread;
    }

    public int getMax() {
	return maximum;
    }

    public int getMin() {
	return minimum;
    }
}
