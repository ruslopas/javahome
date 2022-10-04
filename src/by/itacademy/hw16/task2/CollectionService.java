package by.itacademy.hw16.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionService {

    public int getMax(List<Integer> list) {

	return list.stream()
		   .reduce(Integer::max)
		   .get();
    }

    public int getMin(List<Integer> list) {

	return list.stream()
		   .reduce(Integer::min)
		   .get();
    }

    public Long getMultiplication(List<Integer> list) {

	return list.stream()
		   .mapToLong(a -> a)
		   .reduce((d1, d2) -> d1 * d2)
		   .getAsLong();
    }

    public int getSum(List<Integer> list) {

	return list.stream()
		   .reduce((d1, d2) -> d1 + d2)
		   .get();
    }

    public Double getAverage(List<Integer> list) {

	return list.stream()
		   .mapToDouble(a -> a)
		   .average()
		   .getAsDouble();
    }

    public int getSumOfDigits(List<Integer> list) {
	return list.stream()
		   .mapToInt(a -> (getDigitsSum(a)))
		   .sum();

    }

    public int getDigitsSum(int a) {
	return String.valueOf(a)
		     .chars()
		     .map(Character::getNumericValue)
		     .sum();
    }

    public List<Integer> getArrayList() {

	List<Integer> intNumbers = new ArrayList<>();
	Random rnd = new Random();

	for (int i = 0; i < 10; i++) {
	    intNumbers.add(rnd.nextInt(25));

	}
	return intNumbers;

    }
}
