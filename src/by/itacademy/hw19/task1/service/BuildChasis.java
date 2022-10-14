package by.itacademy.hw19.task1.service;

import by.itacademy.hw19.task1.interfaces.ILineStep;
import by.itacademy.hw19.task1.parts.Chasis;

public class BuildChasis implements ILineStep {

    public Chasis buildProductPart() {
	System.out.println("Build chasis");

	return new Chasis();
    }
}
