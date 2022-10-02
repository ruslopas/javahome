package by.itacademy.hw18.task2;

import java.lang.reflect.Method;

import by.itacademy.hw18.task2.annotation.AcademyInfo;

public class Main {

    public static void main(String[] args) {

	Class<?> aClass = TestAnnotation.class;

	Method[] method = aClass.getDeclaredMethods();
	System.out.println("Все методы класса TestAnnotation :\n");

	for (Method m : method) {
	    System.out.println(m);
	}

	System.out.println("\nПроверяем наличие аннотаций у этих методов :\n");

	for (Method m : method) {
	    if (m.getAnnotation(AcademyInfo.class) == null) {
		System.out.println("У этого метода нет аннотации");
	    } else {
		System.out.println(m.getAnnotation(AcademyInfo.class));
	    }

	}

    }

}
