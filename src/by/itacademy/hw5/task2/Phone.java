package by.itacademy.hw5.task2;

import java.util.Arrays;

public class Phone {

	// Fields

	private String model;
	private int number;
	private double weight;

	// Constructors

	Phone() {

	}

	Phone(String model, int number) {
		this.model = model;
		this.number = number;
	}

	Phone(String model, int number, double weight) {
		this(model, number);
		this.weight = weight;
	}

	// Methods

	public String recieveCall(String name) {
		return name + " is calling.";
	}

	public String recieveCall(String name, int number) {
		return "Name " + name + ", phone number -> " + number;
	}

	public String getNumber() {
		return "Phone " + model + ", number -> " + number;
	}

	public String sendMessage(int... numbers) {
		return Arrays.toString(numbers);
	}

}
