package by.itacademy.hw12.task2;

import java.io.File;

public class Main {

    public static void main(String args[]) {

	System.out.println("Create text file for Task2");
	IOservice.createTxtFile();

	File file = new File("TextForTask2");
	System.out.printf("File \"%s\" is available on path -> %s\n\n", file.getName(), file.getAbsolutePath());

	String text = IOservice.getString(file);
	System.out.println(text);

	System.out.printf("Number of punctuation in text : %s\n", IOservice.getPunctuation(text));
	System.out.printf("Number of words in text : %s", IOservice.getWords(text));
    }

}
