package by.itacademy.hw12.task3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

public class Service {

    public static double getAverage(File file) {

	try (FileInputStream inp = new FileInputStream(file)) {

	    int i = 0;
	    double sumOfnums = 0;
	    int average = inp.available();

	    while ((i = inp.read()) != -1) {
		sumOfnums += i;
		System.out.printf("%s ", i);
	    }
	    double result = sumOfnums / average;
	    return result;

	} catch (FileNotFoundException e) {
	    System.out.println(e.getMessage());

	} catch (IOException e) {
	    System.out.println(e.getMessage());

	}
	return 0;

    }

    public static void createFile(int num) {

	Random rnd = new Random();

	try (FileOutputStream rndNums = new FileOutputStream("nums.bin")) {
	    for (int i = 0; i < num; i++) {
		rndNums.write(rnd.nextInt(100));
	    }

	} catch (IOException e) {
	    System.out.println(e.getMessage());
	}
    }

}
