package by.itacademy.hw18.task1;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

	Class<?> myClass = HashMap.class;
	InfoService infoService = new InfoService();

	System.out.printf("Пакет класса HashMap :\n \n* %s\n", myClass.getPackage());
	System.out.printf("\nРодительский класс класса HashMap :\n \n* %s\n", myClass.getSuperclass());

	System.out.println("\nВнутренние классы класса HashMap : \n");
	infoService.getEncloClass(myClass);

	System.out.println("\nВсе поля класса HashMap :\n");
	infoService.getDeclaredFields(myClass);

	System.out.println("\nВсе констукторы класса HashMap :\n");
	infoService.getDeclaredConstructors(myClass);

	System.out.println("\nВсе методы класса HashMap :\n");
	infoService.getDeclaredMethods(myClass);

	System.out.println("\nВсе public методы класса HashMap включая методы родительского класса :\n");
	infoService.getMethods(myClass);

    }

}
