package by.itacademy.hw3;

import java.util.Scanner;

/*
Пользователь вводит два целых однозначных числа.
Программа задаёт вопрос: результат умножения первого числа на второе.
 Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет.
  Если нет  – показать еще и правильный результат.
 */

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое целое число : ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число : ");
        int b = scanner.nextInt();

        verificationOfMultiplication(a, b);

    }


    public static void verificationOfMultiplication(int a, int b) {
        System.out.print("Введите ответ " + a + " * " + b + " = ");
        Scanner scanner = new Scanner(System.in);
        int c = scanner.nextInt();
        scanner.close();

        //int d = a * b;

        if (c == a * b) {
            System.out.println("Правильно");
        } else {
            System.out.println("Неправильно.Правильный ответ : " + (a * b));
        }
    }

}


