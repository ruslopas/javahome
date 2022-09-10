package by.itacademy.hw12.task4;

import java.io.Serializable;

public class Person implements Serializable{

    private static final long serialVersionUID = 1L;
    private String name;
    private String surname;

    private int age;

    public Person(String name, String surname, int age) {

	this.name = name;
	this.surname = surname;
	this.age = age;
    }

    public String getName() {
	return name;
    }

    public String getSurname() {
	return surname;
    }

    public int getAge() {
	return age;
    }

}
