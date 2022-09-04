package by.itacademy.hw8.task3;

import java.util.ArrayList;

/*
 * Магазин одежды. Создать иерархию предметов одежды и обуви, 
 * при этом размеры одежды и обуви должны являться перечислениями. 
 * Реализовать поиск одежды и обуви по размеру, цвету, 
 * узнать есть ли определенный товар в наличии в т.д. 
 * Пользователь должен иметь возможность приобрести товар, 
 * получить все доступные товары по размеру, 
 * узнать есть ли определенный товар в наличии в т.д. 
 */

public class Main {

	public static void main(String[] args) {

		Shoes sneakers = new Sneakers("red", "Nike", ShoesSize.SIZE_37.getSize(), 35.5);
		Shoes sneakers2 = new Sneakers("white", "Abibas", ShoesSize.SIZE_45.getSize(), 10.4);
		Shoes boots = new Boots("Black", "Noname", ShoesSize.SIZE_41.getSize(), 36.8);

		Clothes jacket = new Jacket("Green", "wer", ClothesSize.SIZE_S.getClothesSize(), 15.3);
		Clothes sweater = new Sweater("Blue", "Fantasy", ClothesSize.SIZE_XXL.getClothesSize(), 27);
		
		Stock stock = new Stock(new ArrayList<>(), new ArrayList<>());
		stock.addShoesList(sneakers, sneakers2, boots);
		stock.addClothesList(jacket, sweater);
	}
}
