package by.itacademy.hw8.task3;

public enum ShoesSize {

	SIZE_35("35"), SIZE_36("36"), SIZE_37("37"), SIZE_38("38"), SIZE_39("39"), SIZE_40("40"), SIZE_41("41"),
	SIZE_42("42"), SIZE_43("43"), SIZE_44("44"), SIZE_45("45");

	public String size;

	private ShoesSize(String size) {
		this.size = size;

	}

	public String getSize() {
		return size;
	}
}
