package by.itacademy.hw2;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		long second;

		System.out.println("Введите число секунд");
		Scanner scanner = new Scanner(System.in);
		second = scanner.nextLong();
		scanner.close();
		
		convertSeconds(second);

	}

	public static void convertSeconds(long second) {

		int sec, min, hour, day, week;
		week = (int) second / 604800;
		second = second % 604800;

		day = (int) second / 86400;
		second = second % 86400;

		hour = (int) second / 3600;
		second = second % 3600;

		min = (int) second / 60;
		second = second % 60;

		sec = (int) second;

		System.out.println("Время: " + week + "н " + day + "д " + hour + "ч " + min + "мин " + sec + "сек");
	}

}
