package by.itacademy.hw18.task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InfoService {

    public void getDeclaredFields(Class<?> aClass) {

	Field[] declaredField = aClass.getDeclaredFields();
	for (int i = 0; i < declaredField.length; i++) {
	    System.out.printf("%s. %s\n", i + 1, declaredField[i]);
	}
    }

    public void getDeclaredConstructors(Class<?> aClass) {

	Constructor<?>[] constructors = aClass.getDeclaredConstructors();
	for (int i = 0; i < constructors.length; i++) {
	    System.out.printf("%s. %s\n", i + 1, constructors[i]);

	}
    }

    public void getDeclaredMethods(Class<?> aClass) {

	Method[] declaredMethod = aClass.getDeclaredMethods();
	for (int i = 0; i < declaredMethod.length; i++) {
	    System.out.printf("%s. %s\n", i + 1, declaredMethod[i]);

	}
    }

    public void getMethods(Class<?> aClass) {

	Method[] publicMethodsWithSuper = aClass.getMethods();
	for (int i = 0; i < publicMethodsWithSuper.length; i++) {
	    System.out.printf("%s. %s\n", i + 1, publicMethodsWithSuper[i]);

	}

    }

    public void getEncloClass(Class<?> aClass) {

	if (aClass.getEnclosingClass() == null) {
	    System.out.println("* Нет внутренних классов");
	}

    }
}
