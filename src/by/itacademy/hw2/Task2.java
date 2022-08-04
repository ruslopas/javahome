package by.itacademy.hw2;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        int a, b, c;

        System.out.println("Введите первое число (а)");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();

        System.out.println("Введите второе число (b)");
        b = scanner.nextInt();
        scanner.close();

        c = sumAndMultiply(a, b);

        System.out.println("(a + b) * (a * b) = " + c);
    }

    public static int sumAndMultiply(int a, int b) {

        return (a + b) + a * b;
    }
}