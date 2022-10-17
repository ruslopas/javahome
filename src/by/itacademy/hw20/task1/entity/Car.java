package by.itacademy.hw20.task1.entity;

public class Car {

    private String manufacturer;
    private String model;
    private String number;
    private String owner;

    public Car(String owner, String manufacturer, String model, String number) {
	this.manufacturer = manufacturer;
	this.model = model;
	this.number = number;
	this.owner = owner;
    }

    public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
	this.model = model;
    }

    public void setNumber(String number) {
	this.number = number;
    }

    public void setOwner(String owner) {
	this.owner = owner;
    }

    public String getManufacturer() {
	return manufacturer;
    }

    public String getModel() {
	return model;
    }

    public String getNumber() {
	return number;
    }

    public String getOwner() {
	return owner;
    }

}
