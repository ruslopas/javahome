package by.itacademy.hw19.task1;

import by.itacademy.hw19.task1.product.Car;
import by.itacademy.hw19.task1.service.AssemblyLineProduct;
import by.itacademy.hw19.task1.service.BuildBody;
import by.itacademy.hw19.task1.service.BuildChasis;
import by.itacademy.hw19.task1.service.BuildEngine;

public class Main {

    public static void main(String[] args) {

	System.out.println("Start new Line");
	AssemblyLineProduct line = new AssemblyLineProduct(new BuildBody(), new BuildChasis(), new BuildEngine());
	
	System.out.println("Start building Car");
	Car car = new Car();
	car = (Car) line.assembleProduct(car);
    }
}
