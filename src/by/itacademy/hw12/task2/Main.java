package by.itacademy.hw12.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
//TODO обработать исключения
    public static void main(String args[]) throws Exception {

	System.out.println("Create text file for Task2");
	txtFileCreation();

	File file = new File("TextForTask2");
	System.out.printf("File \"%s\" is available on path -> %s\n\n", file.getName(), file.getAbsolutePath());

	String text = getString(file);

	System.out.println(text);
	System.out.printf("Number of punctuation in text : %s\n", getPunctuation(text));
	System.out.printf("Number of words in text : %s", getWords(text));
    }

    public static String getString(File file) throws Exception {

	FileInputStream fis = new FileInputStream(file);

	byte[] bytesArray = new byte[(int) file.length()];

	fis.read(bytesArray);
	fis.close();
	String text = new String(bytesArray);

	return text;

    }

    public static int getPunctuation(String text) {

	int count = 0;

	Pattern pattern = Pattern.compile("[!.,;:?\\-]");
	Matcher matcher = pattern.matcher(text);

	while (matcher.find()) {
	    count++;

	}
	return count;

    }

    public static int getWords(String text) {

	int count = 0;

	String[] data = text.split(" ");
	for (int i = 0; i < data.length; i++) {
	    count++;

	}
	return count;
    }

    public static void txtFileCreation() throws Exception {

	FileWriter fileCreation = new FileWriter("TextForTask2");
	fileCreation.write("В повседневной жизни иногда возникают ситуации, которые мы не планировали.\n"
		+ "Например, встаешь утром на работу, ищешь зарядное устройство к телефону - а его нет.\n"
		+ "Идешь в ванную, чтобы умыться - отключили воду." + " Сел в машину - не заводится.\n"
		+ "Но человек в состоянии довольно легко справиться с такими непредвиденными ситуациями.\n");
	fileCreation.close();

    }
}
