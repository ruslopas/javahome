package by.itacademy.hw19.task1.service;

import by.itacademy.hw19.task1.interfaces.ILineStep;
import by.itacademy.hw19.task1.parts.Engine;

public class BuildEngine implements ILineStep {

    public Engine buildProductPart() {
	System.out.println("Build engine");

	return new Engine();
    }
}
