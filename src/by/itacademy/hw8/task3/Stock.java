package by.itacademy.hw8.task3;

import java.util.ArrayList;

public class Stock {
	private ArrayList<Shoes> shoesList;
	private ArrayList<Clothes> clothesList;

	public Stock(ArrayList<Shoes> shoesList, ArrayList<Clothes> clothesList) {
		this.shoesList = shoesList;
		this.clothesList = clothesList;
	}

	public void addShoesList(Shoes... shoes) {
		for (Shoes shoes1 : shoes) {
			shoesList.add(shoes1);
		}
	}

	public void addClothesList(Clothes... clothes) {
		for (Clothes clothes1 : clothes) {
			clothesList.add(clothes1);
		}
	}
}
