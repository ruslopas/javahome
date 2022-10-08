package by.itacademy.hw19.task1.product;

import by.itacademy.hw19.task1.interfaces.IProduct;
import by.itacademy.hw19.task1.interfaces.IProductPart;

public class Car implements IProduct {

    public void installFirstPart(IProductPart body) {
	System.out.println("Install body");
    }

    public void installSecondPart(IProductPart chasis) {
	System.out.println("Install chasis");
    }

    public void installThirdPart(IProductPart engine) {
	System.out.println("Install chasis");
    }
}
