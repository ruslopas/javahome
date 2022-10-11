package by.itacademy.hw20.task1.datasource;

import java.util.HashMap;
import java.util.Map;

import by.itacademy.hw20.task1.entity.Master;

public class HRDepartmentRepo {

    private final Map<String, Master> masters = new HashMap<>();
    private static volatile HRDepartmentRepo instance;
    
    private HRDepartmentRepo() {
	
	masters.put("Михаил Иванов", new Master("Михаил Иванов","27","моторист"));
	masters.put("Василий Пупкин", new Master("Василий Пупкин","22","электрик"));
	masters.put("Дмитрий Маркевич", new Master("Дмитрий Маркевич","44","слесарь"));
	masters.put("Евгений Кочура", new Master("Евгений Кочура","33","слесарь"));
	masters.put("Михайло Ломоносов", new Master("Михайло Ломоносов","311","слесарь"));
    }

    public static HRDepartmentRepo getInstance() {
	if (instance == null) {
	    instance = new HRDepartmentRepo();
	}
	return instance;
    }

    public Map<String, Master> getMasters() {
	return masters;
    }
    
    
}
