package by.itacademy.hw9.task2;
/*
 * Реализовать класс Pair, который будет содержать 2 значения любого типа.
 *  Класс должен уметь возвращать первый элемент, 
 *  второй элемент, менять их местами, поменять первый элемент на новый
 *  , поменять второй элемент на новый.
 */

public class Pair<T, V> {

	private T firstValue;
	private V secondValue;

	public Pair(T firstValue, V secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	public T getFirstValue() {
		return firstValue;
	}

	public V getSecondValue() {
		return secondValue;
	}

	public void setFirstValue(T firstValue) {
		this.firstValue = firstValue;
	}

	public void setSecondValue(V secondValue) {
		this.secondValue = secondValue;
	}

	public Pair<T, V> swapValues() {
		return new Pair(secondValue, firstValue);

	}
}
