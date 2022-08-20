package by.itacademy.hw6;
/*Вводится ненормированная строка, у которой могут быть пробелы в начале, 
 * в конце и между словами более одного пробела.
 *  Привести ее к нормированному виду, т.е. удалить все пробелы в начале и конце,
 *   а между словами оставить только один пробел  */

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		String line = inputFromScanner();
		System.out.println("Formatted string :\n" + replaceSpaces(line));

	}

	public static String replaceSpaces(String line) {

		return line.trim().replaceAll("\\s+", " ");
	}

	public static String inputFromScanner() {

		System.out.println("Enter a string :");
		Scanner input = new Scanner(System.in);

		return input.nextLine();
	}

}
