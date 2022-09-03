package by.itacademy.hw10.task3;

/*
 * Реализуйте свой собственный стек (очередь LIFO) со стандартными функциями push() и pop(), 
 * а также с дополнительной функцией max(). Продемонстрируйте его работу.
 */

class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(5);

		stack.push(24);
		stack.push(33);
		stack.push(1);
		stack.push(5);
		stack.push(50);

		System.out.printf("The max element in stack is : %s\n", stack.max());
		System.out.printf("The stack size is %s\n", stack.size());

		stack.pop();
		stack.pop();
		stack.push(3);

		System.out.printf("The stack size is %s\n", stack.size());

		stack.pop();

		if (stack.isEmpty()) {
			System.out.println("The stack is empty");
		} else {
			System.out.println("The stack is not empty");
		}
	}
}
