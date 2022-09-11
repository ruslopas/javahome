package by.itacademy.hw9.task2;

public class Main {

	public static void main(String[] args) {

		Pair pair = new Pair("Cat", 55);

		System.out.printf("Source Pair : %s %s\n", pair.getFirstValue(), pair.getSecondValue());
		System.out.printf("Return first value : %s\n", pair.getFirstValue());
		System.out.printf("Return second value : %s\n\n", pair.getSecondValue());

		System.out.println("Change first value  ");
		pair.setFirstValue("Dog");
		System.out.printf("Modified Pair : %s %s\n\n", pair.getFirstValue(), pair.getSecondValue());

		System.out.println("Change second value ");
		pair.setSecondValue(33);
		System.out.printf("Modified Pair : %s %s\n\n", pair.getFirstValue(), pair.getSecondValue());

		System.out.println("Swap values ");
		Pair swapPair = pair.swapValues();
		System.out.printf("Swaped Pair : %s %s\n", swapPair.getFirstValue(), swapPair.getSecondValue());
	}

}
