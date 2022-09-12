package by.itacademy.hw10.task1;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/*
 * Напишите методы union(Set<?> set1, Set<?> set2) и intersect(Set<?> set1,
 * Set<?> set2), реализующих операции объединения и пересечения множеств.
 */

public class Main {

	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<>(createSet());
		Set<Integer> set2 = new HashSet<>(createSet());

		System.out.println("set1 :      " + set1.toString());
		System.out.println("set2 :      " + set2.toString());
		System.out.println("union :     " + union(set1, set2).toString());
		System.out.println("intersect : " + intersect(set1, set2).toString());
	}

	public static Set<Integer> createSet() {

		Set<Integer> newSet = new HashSet<>();
		Random randomInt = new Random();
		for (int i = 0; i < 10; i++) {
			newSet.add(randomInt.nextInt(15));
		}
		return newSet;

	}

	public static <T> Set<T> union(Set<T> set1, Set<T> set2) {

		Set<T> unionSet = new HashSet<>(set1);
		unionSet.addAll(set2);
		return unionSet;
	}

	public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {

		Set<T> intersectSet = new HashSet<>();
		for (T element : set1) {
			if (set2.contains(element)) {
				intersectSet.add(element);
			}
		}
		return intersectSet;
	}
}