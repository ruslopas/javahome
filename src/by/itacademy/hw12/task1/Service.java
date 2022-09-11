package by.itacademy.hw12.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Service {

    public static void createNewFile(List<String> listIn1, List<String> listIn2) {

	List<String> out = new ArrayList<>();

	out.addAll(listIn1);
	out.addAll(listIn2);

	try (FileWriter writer = new FileWriter("out.txt")) {
	    for (String str : out) {
		writer.write(str);
	    }

	} catch (IOException e) {
	    System.out.println(e.getMessage());

	}

    }

    public static List<String> readFile(String filename) {

	List<String> nums = null;

	try {
	    nums = Files.readAllLines(Paths.get(filename));

	} catch (IOException e) {
	    System.out.println(e.getMessage());

	}
	return nums;

    }

    public static void createFile(int amountOfNums, String fileName) {

	Random rnd = new Random();

	try (FileWriter writer = new FileWriter(fileName)) {
	    for (int i = 0; i < amountOfNums; i++) {
		writer.write(rnd.nextInt(1000) + " ");
	    }
	} catch (IOException e) {
	    System.out.println(e.getMessage());
	}

    }
}
