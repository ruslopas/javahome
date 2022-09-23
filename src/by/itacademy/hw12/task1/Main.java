package by.itacademy.hw12.task1;

public class Main {

    public static void main(String[] args) {

	int amountOfNums = 1000;

	System.out.println("Create file in1.txt");
	Service.createFile(amountOfNums, "in1.txt");

	System.out.println("Create file in2.txt");
	Service.createFile(amountOfNums, "in2.txt");

	System.out.println("\nRead created files");

	System.out.println("\nCreate new file out.txt from in1.txt and in2.txt");
	Service.createNewFile(Service.readFile("in1.txt"), Service.readFile("in2.txt"));

    }

   
}
