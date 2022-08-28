package by.itacademy.hw8.task3;

public enum ClothesSize {
	SIZE_XS("XS"), SIZE_S("S"), SIZE_M("M"), SIZE_L("L"), SIZE_XL("XL"), SIZE_XXL("XXL");

	private String clothesSize;

	ClothesSize(String clothesSize) {
		this.clothesSize = clothesSize;
	}

	public String getClothesSize() {
		return clothesSize;
	}

}
