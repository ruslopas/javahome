package by.itacademy.hw20.task1.menus;

import java.util.Scanner;
import by.itacademy.hw20.task1.services.HRService;

public class HRDepartmentMenu {

    public void runHRMenu() {

	@SuppressWarnings("resource")
	Scanner hrMenu = new Scanner(System.in);
	String button = "";

	while (!button.equalsIgnoreCase("q")) {

	    System.out.println("\n   *Отдел кадров*");

	    System.out.println("[1] Взять на работу \n"
	                     + "[2] Уволить\n"
		             + "[3] Просмотр информации о работниках\n"
	                     + "[4] Просмотр подробной информации о работнике\n"
		             + "[Q] Выход в главное меню");

	    button = hrMenu.nextLine().toLowerCase();

	    switch (button) {
	    case "1":
		HRService recruit = new HRService();
		recruit.recruitMaster();
		break;
	    case "2":
		HRService fireMaster = new HRService();
		fireMaster.fireMaster();
		break;
	    case "3":
		HRService info = new HRService();
		info.veiwingInfo();
		break;
	    case "4":
		HRService detailedInfo = new HRService();
		detailedInfo.detailedInfo();
		
		break;
	    case "Q":
		break;
	  
	    }
	}
    }

}
