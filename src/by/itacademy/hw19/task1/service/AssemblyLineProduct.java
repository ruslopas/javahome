package by.itacademy.hw19.task1.service;

import by.itacademy.hw19.task1.interfaces.IAssemblyLine;
import by.itacademy.hw19.task1.interfaces.ILineStep;
import by.itacademy.hw19.task1.interfaces.IProduct;

public class AssemblyLineProduct implements IAssemblyLine {
    ILineStep buildBody, buildChasis, buildEngine;

    public AssemblyLineProduct(BuildBody buildBody, BuildChasis buildEngine, BuildEngine buildChasis) {
	this.buildBody = buildBody;
	this.buildEngine = buildEngine;
	this.buildChasis = buildChasis;
    }

    public IProduct assembleProduct(IProduct product) {

	System.out.println("Assembly car");

	product.installFirstPart(buildBody.buildProductPart());
	product.installSecondPart(buildChasis.buildProductPart());
	product.installThirdPart(buildEngine.buildProductPart());

	System.out.println("Car is assembled");

	return product;
    }

}
