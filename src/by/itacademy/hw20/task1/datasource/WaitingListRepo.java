package by.itacademy.hw20.task1.datasource;

import java.util.HashMap;
import java.util.Map;

import by.itacademy.hw20.task1.entity.Car;

public class WaitingListRepo {

    private final Map<String, Car> waitingList = new HashMap<>();
    private static volatile WaitingListRepo instance;

    public static WaitingListRepo getInstance() {
	if (instance == null) {
	    instance = new WaitingListRepo();
	}

	return instance;
    }

    public Map<String, Car> getWaitingList() {
	return waitingList;
    }

}
