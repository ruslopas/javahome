package by.itacademy.hw12.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import java.util.List;

public class Main {

    public static void main(String[] args) {

	Person vasya = new Person("Vasya", "Pupkin", 18);
	Person petya = new Person("Petr", "Petrov", 25);
	Person vika = new Person("Viktoria", "Ozerova", 33);
	Person polina = new Person("Polina", "Ivanova", 15);
	Person dima = new Person("Dmitry", "Markevich", 45);

	File persons = new File("persons.txt");

	try (FileOutputStream personsOut = new FileOutputStream(persons)) {
	    System.out.println("Create file...");

	    ObjectOutputStream output = new ObjectOutputStream(personsOut);
	    output.writeObject(vasya);
	    output.writeObject(petya);
	    output.writeObject(vika);
	    output.writeObject(polina);
	    output.writeObject(dima);

	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	if (persons.exists()) {
	    System.out.printf("File \"%s\" is available on the path -> %s\n", persons.getName(),
		    persons.getAbsolutePath());
	}
	List<Person> personsArray = new ArrayList<>();

	try (FileInputStream personsIn = new FileInputStream(persons)) {
	    ObjectInputStream input = new ObjectInputStream(personsIn);
	
	    Person rest1 = (Person) input.readObject();
	    Person rest2 = (Person) input.readObject();
	    Person rest3 = (Person) input.readObject();
	    Person rest4 = (Person) input.readObject();
	    Person rest5 = (Person) input.readObject();
	    
	    personsArray.add(rest1);
	    personsArray.add(rest2);
	    personsArray.add(rest3);
	    personsArray.add(rest4);
	    personsArray.add(rest5);

	    System.out.printf("%s %s %s\n",rest1.getName(),rest1.getSurname(),rest1.getAge());
	    System.out.printf("%s %s %s\n",rest2.getName(),rest2.getSurname(),rest2.getAge());
	    System.out.printf("%s %s %s\n",rest3.getName(),rest3.getSurname(),rest3.getAge());
	    System.out.printf("%s %s %s\n",rest4.getName(),rest4.getSurname(),rest4.getAge());
	    System.out.printf("%s %s %s\n",rest5.getName(),rest5.getSurname(),rest5.getAge());

	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

	System.out.println();

    }
}