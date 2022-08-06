package by.itacademy.hw3;

import java.util.Scanner;

//Check number for even-odd

public class Task1 {
    public static void main(String[] args) {

        System.out.print("Введите целое число : ");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            System.out.println("Это не целое число");
            scanner.next();
        }

        int num = scanner.nextInt();

        scanner.close();

        checkEvenOrOdd(num);

    }

    public static void checkEvenOrOdd(int num) {

        if (num % 2 != 0) {
            System.out.println(num + " нечетное число");
        }

    }
}