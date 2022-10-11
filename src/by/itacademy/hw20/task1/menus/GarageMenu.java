package by.itacademy.hw20.task1.menus;

import java.util.Scanner;

public class GarageMenu {
    public void runGarageMenu() {

	@SuppressWarnings("resource")
	Scanner garageMenu = new Scanner(System.in);
	String button = "";
	
	while (!button.equalsIgnoreCase("q")) {

	    System.out.println("\n   *Зона ремонта*");

	    System.out.println("[1]Автомобили в ремонте\n[Q]Выход в главное меню");

	    button = garageMenu.nextLine().toLowerCase();

	    switch (button) {
	    case "1":

		break;
	
	    default:
		break;
	    }
	}
    }
}
