package by.itacademy.hw3;

import java.util.Scanner;

/*В три переменные a, b, и c записаны 3 целых неравных между собой числа.
 Создать программу, которая выведет числа по возрастанию.*/
public class Task4 {
    public static void main(String[] args) {


        System.out.println("Введите три целых неравных числа");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число : ");
        int a = scanner.nextInt();

        System.out.print("Введите второе число : ");
        int b = scanner.nextInt();

        System.out.print("Введите третье число : ");
        int c = scanner.nextInt();

        if (a < b && b < c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && c < b) {
            System.out.println(a + " " + c + " " + b);
        } else if (b < a && a < c) {
            System.out.println(b + " " + a + " " + c);
        } else if (b < c && c < a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c < a && a < b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c < b && b < a) {
            System.out.println(c + " " + b + " " + a);
        } else System.out.println("Есть равные числа,вывод чисел в порядке возрастания невозможен");

    }


}

