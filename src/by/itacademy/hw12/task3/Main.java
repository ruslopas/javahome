package by.itacademy.hw12.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Main {
//TODO exeptions
    public static void main(String[] args) {

	int amountOfNums = 30;

	System.out.printf("Create file with %s random numbers\n", amountOfNums);
	createFile(amountOfNums);

	File file = new File("nums.bin");
	System.out.printf("File \"%s\" is available on path -> %s\n\n", file.getName(), file.getAbsolutePath());

	System.out.println("Calculate the average of numbers in created file");
	System.out.printf("\nAverage : %.2f", getAverage(file));

    }

    private static double getAverage(File file) {
	try (FileInputStream inp = new FileInputStream(file)) {
	    int average = inp.available();
	    int i = 0;
	    double sumOfnums = 0;
	    while ((i = inp.read()) != -1) {
		sumOfnums += i;
		System.out.printf("%s ", i);

	    }
	    double result = sumOfnums / average;
	    return result;
	} catch (FileNotFoundException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return 0;

    }

    private static void createFile(int num) {

	try (FileOutputStream rndNums = new FileOutputStream("nums.bin")) {
	    Random rnd = new Random();
	    for (int i = 0; i < num; i++) {
		rndNums.write(rnd.nextInt(100));
	    }

	} catch (IOException e) {
	    e.printStackTrace();
	}
    }

}
