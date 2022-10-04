package by.itacademy.hw16.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionService {

    public List<String> getCollection() {

	List<String> newArrayList = new ArrayList<>();

	newArrayList.add("login");
	newArrayList.add("Hello world");
	newArrayList.add("Java 2022");
	newArrayList.add("stream api");
	newArrayList.add("online diagnostic software");
	newArrayList.add("autodata");
	newArrayList.add("Bosch ESItronic");
	newArrayList.add("log");

	return newArrayList;
    }

    public List<String> getSource(List<String> list) {
	return list.stream()
		   .collect(Collectors.toList());
    }

    public String getMin(List<String> list) {
	return list.stream()
		   .min(Comparator.comparing(String::length))
		   .get();
    }

    public String getMax(List<String> list) {
	return list.stream()
		   .max(Comparator.comparing(String::length))
		   .get();
    }

    public long getEquals(List<String> list,String word) {
	return list.stream()
		   .filter(word::equals)
		   .count();
    }

    public List<String> getStringWord(List<String> list) {
	return list.stream()
		   .filter(a -> a.trim().matches("\\b\\w+\\b"))
		   .collect(Collectors.toList());
    }

    public List<String> getAllWords(List<String> list) {
	return list.stream()
		   .map(a -> a.split("\\W+"))
		   .flatMap(words -> Arrays.stream(words))
		   .collect(Collectors.toList());
    }
}
