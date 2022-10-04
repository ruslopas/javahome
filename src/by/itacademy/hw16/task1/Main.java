package by.itacademy.hw16.task1;

import java.util.ArrayList;
import java.util.List;

/* Дана коллекция Collection<String> col. С помощью stream api:
         узнать, содержит ли какая-нибудь из строк слово login
         найти самую длинную строку
         найти самую короткую строку
         найти строки-слова (не содержат пробелов и знаков препинания)
         получить все слова используемые в строках
*/

public class Main {

    public static void main(String[] args) {

	CollectionService colService = new CollectionService();

	List<String> collection = new ArrayList<>(colService.getCollection());

	System.out.println("Все строки в коллекции : " + colService.getSource(collection));

	System.out.printf("Самая короткая строка : \" %s \"", colService.getMin(collection));

	System.out.printf("\nСамая длинная строка : \" %s \"", colService.getMax(collection));

	System.out.printf("\nКоличество совпадений со строкой \" login \" :  %s ",
	                      colService.getEquals(collection,"login"));

	System.out.println("\nСтроки-слова в коллекции : " 
	                      + String.join(", ", colService.getStringWord(collection)));

	System.out.println("Все слова в коллекции : "
	                      + String.join(", ", colService.getAllWords(collection)));
    }

}
