package by.itacademy.hw20.task1.services;

import by.itacademy.hw20.task1.datasource.WaitingListRepo;
import by.itacademy.hw20.task1.entity.Car;

public class WaitiingListService {

    final WaitingListRepo waitingList = WaitingListRepo.getInstance();

    public void addCar() {

	Car car = new Car(null, null, null, null);

	System.out.print("Введите фамилию заказчика : ");
	car.setOwner(ConsoleService.input());

	System.out.print("Введите марку автомобиля : ");
	car.setManufacturer(ConsoleService.input());

	System.out.print("Введите модель автомобиля : ");
	car.setModel(ConsoleService.input());

	System.out.print("Введите номер автомобиля : ");
	car.setNumber(ConsoleService.input());

	waitingList.getWaitingList().put(car.getNumber(), car);

	System.out.printf("\n %s %s %s добавлен в лист ожидания\n", 
		                         car.getManufacturer(), 
		                         car.getModel(),
		                         car.getNumber());

    }

    public void removeCar() {

	System.out.print("Введите номер автомобиля : ");
	waitingList.getWaitingList()
	           .remove(ConsoleService.input());

	System.out.println("Автомобиль удален из листа ожидания");
    }

    public void viewingInfo() {

	if (waitingList.getWaitingList()
		       .isEmpty()) {
	    
	    System.out.println("Лист ожидания пуст (\n");
	}

	waitingList.getWaitingList()
	           .entrySet()
	           .forEach(e -> System.out.printf("%s %s %s\n", e.getValue().getNumber(),
		                                                 e.getValue().getManufacturer(),
		                                                 e.getValue().getModel()));

    }

}
