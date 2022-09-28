package by.itacademy.hw10.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * Ввести текст с клавиатуры. Для текста создать Map,
 *  где ключом будет слово, а значение – количество 
 *  повторений этого слова в тексте.
 *  
  TEXT
  
  Until now we talked only of object types and java templates used for creating objects. Butwhat if we would need to design a class with functionality that applies to multiple typesof objects? Since every class in Java extends the Object class, we can create a class witha method that receives a parameter of type Object, and in the method we can test theobject type. Take this for granted; it is covered later.
 */

public class Main {

	public static void main(String[] args) {

		String text = inputFromScanner();
		String[] textArray = text.trim().replaceAll("[^0-9a-zA-Z']+", " ").toLowerCase().split(" ");

		Map<String, Integer> wordsCount = new HashMap<>();

		for (String word : textArray) {
			if (!wordsCount.containsKey(word)) {
				wordsCount.put(word, 1);

			} else {
				int count = wordsCount.get(word);
				wordsCount.put(word, count + 1);
			}
		}
		for (Entry<String, Integer> entry : wordsCount.entrySet()) {
			System.out.printf(" %s->%s\n", entry.getKey(), entry.getValue());
		}
	}

	public static String inputFromScanner() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter text please:");

		return scanner.nextLine();
	}

}
