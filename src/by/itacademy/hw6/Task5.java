
package by.itacademy.hw6;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task5 {

	public static void main(String[] args) {

		String oop = "Object-oriented programming is a programming language model organized around objects \nrather than"
				+ " \"actions\" and data rather than logic. Object-oriented programming blabla. \nObject-oriented "
				+ "programming bla bla bla object-oriented programming\n"
				+ "programming bla bla bla object-oriented programming\n"
				+ "programming bla bla bla object-oriented programming\n";

		System.out.println("Before replacement: \n");
		System.out.println(oop);

		System.out.println("After replacement: \n");
		System.out.println(replaceOop(oop, "Object-oriented programming", "OOP"));

	}

	public static String replaceOop(String text, String oldString, String newString) {

		StringBuilder str = new StringBuilder();
		Pattern pattern = Pattern.compile(oldString, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(text);
		
		int counter = 0;
		while (matcher.find()) {
			if ((counter++) % 2 != 0) {
				matcher.appendReplacement(str, newString);
			}
		}
		matcher.appendTail(str);
		return str.toString();
	}

}
