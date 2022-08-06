package by.itacademy.hw3;

import java.util.Scanner;
/*
Передать на вход программы число,
 если оно нечетное положительное или четное  отрицательное,
 вывести соответствующий текст.
 */
public class Task2 {
    public static void main(String[] args) {

        System.out.print("Введите целое число : ");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {

            System.out.println("Это не целое число");
            scanner.next();

        }
        int num = scanner.nextInt();

        scanner.close();

        if (num > 0 && num % 2 != 0)  {
            System.out.println(num +" нечетное положительное число");
        }else if (num < 0 && num % 2 == 0){
            System.out.println(num + " чётное отрицательное число");
        }
    }
}