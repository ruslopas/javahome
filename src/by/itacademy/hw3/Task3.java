package by.itacademy.hw3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.print("Введите число от 1 до 7 : ");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {

            System.out.println("Это не число");
            scanner.next();
        }
        int day = scanner.nextInt();

        scanner.close();


        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");
                break;

            default:
                System.out.println("Ошибка!!! Вы ввели не то число");
                break;
        }
    }
}







