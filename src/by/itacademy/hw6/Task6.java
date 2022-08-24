package by.itacademy.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Дана строка “Versions: Java  5, Java 6, Java 7, Java 8, Java 12.” 
//Найти все подстроки "Java X" и распечатать их.

public class Task6 {

	public static void main(String[] args) {

		String version = "\"Versions: Java  5, Java 6, Java 7, Java 8, Java 12 , Java17.\"";
		System.out.println("Source String :\n" + version + "\nFinded versions :");

		findJavaVersion(version);
	}

	public static void findJavaVersion(String version) {

		Pattern pattern = Pattern.compile("Java(\\s*\\d*)");
		Matcher matcher = pattern.matcher(version);

		while (matcher.find())
			System.out.print(matcher.group() + " , ");
	}
}
