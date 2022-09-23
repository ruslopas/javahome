package by.itacademy.hw12.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOservice {

    public static String getString(File file) {

	byte[] bytesArray = new byte[(int) file.length()];

	try (FileInputStream fis = new FileInputStream(file)) {
	    fis.read(bytesArray);
	} catch (IOException e) {
	    System.out.println(e.getMessage());

	}

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

    public static void createTxtFile() {

	try (FileWriter fileCreation = new FileWriter("TextForTask2")) {

	    fileCreation.write("В повседневной жизни иногда возникают ситуации, которые мы не планировали.\n"
		    + "Например, встаешь утром на работу, ищешь зарядное устройство к телефону - а его нет.\n"
		    + "Идешь в ванную, чтобы умыться - отключили воду." + " Сел в машину - не заводится.\n"
		    + "Но человек в состоянии довольно легко справиться с такими непредвиденными ситуациями.\n");
	} catch (IOException e) {
	    System.out.println(e.getMessage());

	}

    }

}
