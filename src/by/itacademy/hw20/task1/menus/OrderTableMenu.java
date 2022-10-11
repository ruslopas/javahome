package by.itacademy.hw20.task1.menus;

import java.util.Scanner;

import by.itacademy.hw20.task1.services.WaitiingListService;

public class OrderTableMenu {
    
    public void runOTMenu() {

	@SuppressWarnings("resource")
	Scanner oTMenu = new Scanner(System.in);
	String button = "";

	while (!button.equalsIgnoreCase("q")) {

	    System.out.println("\n   *Стол заказов*");

	    System.out.println("[1]Добавить автомобиль в лист ожидания\n"
	                     + "[2]Удалить автомобиль из листа ожидания\n"
		             + "[3]Отправить автомобиль в зону ремонта\n"
	                     + "[4]Лист ожидания\n" 
		             + "[Q]Выход в главное меню");

	    button = oTMenu.nextLine().toLowerCase();

	    switch (button) {
	    case "1":
		WaitiingListService newCar = new WaitiingListService();
		newCar.addCar();
		break;
	    case "2":
		WaitiingListService carOut = new WaitiingListService();
		carOut.removeCar();
		break;
	    case "3":

		break;
	    case "4":
		WaitiingListService listVeiw = new WaitiingListService();
		listVeiw.viewingInfo();
		break;
	    case "q":

		break;
	    default:
		break;
	    }
	}
    }
}
