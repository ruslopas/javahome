package by.itacademy.hw12.task3;

import java.io.File;

public class Main {

    public static void main(String[] args) {

	int amountOfNums = 30;

	System.out.printf("Create file with %s random numbers\n", amountOfNums);
	Service.createFile(amountOfNums);

	File file = new File("nums.bin");
	System.out.printf("File \"%s\" is available on path -> %s\n\n", file.getName(), file.getAbsolutePath());

	System.out.println("Calculate the average of numbers in created file");
	System.out.printf("\nAverage : %.2f", Service.getAverage(file));

    }

}
