package by.itacademy.hw12.task1;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int amountOfNums = 10;
	System.out.println("Create file in1.txt");

	createFile(amountOfNums, "in1.txt");
	System.out.println("Create file in2.txt");
	createFile(amountOfNums, "in2.txt");
	System.out.println("Read created files");
	System.out.println("Create new file from in1.txt and in2.txt");
	createNewFile(readFile("in1.txt"), readFile("in2.txt"));

    }

    private static void createNewFile(List<String> listIn1, List<String> listIn2) {
	List<String> out = new ArrayList<>();
	out.addAll(listIn1);
	Collections.sort(out);
	out.addAll(listIn2);
	Collections.sort(out);
	try (FileWriter writer = new FileWriter("out.txt")) {
	    for (String str : out) {
		writer.write(str);
	    }

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    private static List<String> readFile(String filename) {
	List<String> nums = null;
	try {
	    nums = Files.readAllLines(Paths.get(filename));

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();

	}
	return nums;

    }

    private static void createFile(int amountOfNums, String fileName) {
	Random rnd = new Random();
	try (FileWriter writer = new FileWriter(fileName)) {
	    for (int i = 0; i < amountOfNums; i++) {
		writer.write(rnd.nextInt(1000) + " ");
	    }
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }
}
