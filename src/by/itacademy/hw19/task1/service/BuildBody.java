package by.itacademy.hw19.task1.service;

import by.itacademy.hw19.task1.interfaces.ILineStep;
import by.itacademy.hw19.task1.parts.Body;

public class BuildBody implements ILineStep {

    public Body buildProductPart() {
	System.out.println("Build body");

	return new Body();
    }
}
