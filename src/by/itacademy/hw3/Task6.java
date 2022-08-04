package by.itacademy.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        System.out.println("Введите длины сторон треугольника");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите длину первой стороны : ");
        float a = scanner.nextFloat();

        System.out.print("Введите длину второй стороны : ");
        float b = scanner.nextFloat();

        System.out.print("Введите длину третьей стороны : ");
        float c = scanner.nextFloat();

        scanner.close();

        checkTriangle(a, b, c);
    }
    public static void checkTriangle(float a, float b, float c) {

        if (a + b >= c && b + c >= a && c + a >= b) {

            System.out.println("Такой треугольник существует");

        } else {

            System.out.println("Такой треугольник не существует");
        }
    }
}

