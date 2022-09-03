package by.itacademy.hw10.task3;

class Stack {
	private int intArray[];
	private int head;
	private int capacity;

	Stack(int size) {
		intArray = new int[size];
		capacity = size;
		head = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("Stack Overflow\nProgram Terminated\n");
			System.exit(-1);
		}

		System.out.printf("Inserting -> %s\n", x);
		intArray[++head] = x;
	}

	public int pop() {

		if (isEmpty()) {
			System.out.println("Stack Underflow\nProgram Terminated");
			System.exit(-1);
		}

		System.out.printf("Removing <- %s\n", peek());

		return intArray[head--];
	}

	public int max() {
		int maxValue = intArray[0];
		for (int i = 0; i < intArray.length; i++) {

			if (maxValue <= intArray[i]) {
				maxValue = intArray[i];
			}
		}
		return maxValue;
	}

	public int peek() {
		if (!isEmpty()) {
			return intArray[head];
		} else {
			System.exit(-1);
		}

		return -1;
	}

	public int size() {
		return head + 1;
	}

	public boolean isEmpty() {
		return head == -1;

	}

	public boolean isFull() {

		return size() == capacity;
	}
}