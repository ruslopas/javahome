package by.itacademy.hw5.task1;

public class Person {

	// Fields

	private String fullName;
	private int age;

	// Constructors

	public Person() {

	}

	public Person(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	// Methods

	public String move() {
		return " This is " + fullName + " talking";
	}

	public String talk() {
		return " This is " + fullName + " talking";

	}
}
