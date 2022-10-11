package by.itacademy.hw20.task1.menus;

import java.util.Scanner;

public class ConsoleMenu {

    public void runMainMenu() {

	System.out.println("   ***Электронный автосервис v.0.00000001***\n");

	@SuppressWarnings("resource")
	Scanner menu = new Scanner(System.in);
	String button = "";

	while (!button.equalsIgnoreCase("q")) {

	    System.out.println("   *Главное Меню*");
	    System.out.println("[1] Отдел кадров\n"
	                     + "[2] Стол заказов\n"
	                     + "[3] Зона Ремонта\n"
	                     + "[Q] Выход из программы");
	    
	    button = menu.nextLine().toLowerCase();

	    switch (button) {
	    case "1":
		HRDepartmentMenu hrMenu = new HRDepartmentMenu();
		hrMenu.runHRMenu();
		break;
	    case "2":
		OrderTableMenu oTMenu = new OrderTableMenu();
		oTMenu.runOTMenu();
		break;
	    case "3":
		GarageMenu gMenu = new GarageMenu();
		gMenu.runGarageMenu();
		break;
	    case "q":
		System.out.println("Спасибо за использование нашей программы. До свидания.");
		break;
	    default:
		break;
	    }

	}
    }
}
