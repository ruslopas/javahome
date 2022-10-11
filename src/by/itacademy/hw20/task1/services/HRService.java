package by.itacademy.hw20.task1.services;

import by.itacademy.hw20.task1.datasource.HRDepartmentRepo;
import by.itacademy.hw20.task1.entity.Master;

public class HRService {

    final HRDepartmentRepo masters = HRDepartmentRepo.getInstance();

    public void recruitMaster() {

	Master newMaster = new Master(null, null, null);

	System.out.print("Введите имя и фамилию нового специалиста : ");
	newMaster.setName(ConsoleService.input());

	System.out.print("Введите возраст : ");
	newMaster.setAge(ConsoleService.input());

	System.out.print("Введите специальность(слесарь,электрик,моторист) : ");
	newMaster.setSpeciality(ConsoleService.input());

	masters.getMasters().put(newMaster.getName(), newMaster);

	System.out.println(newMaster.getName() + " внесен в базу данных.\n");
    }

    public void fireMaster() {

	System.out.print("Ведите имя и фамилию увольняемого : ");

	String firedMaster = ConsoleService.input();

	masters.getMasters().remove(firedMaster);

	System.out.println(firedMaster + " уволен (");
    }

    public void veiwingInfo() {
	
	if (masters.getMasters().isEmpty()) {
	    System.out.println("У нас нет работников( ");
	}
	masters.getMasters().entrySet()
		.forEach(e -> System.out.printf("%s - %s\n", e.getValue().getName(), 
			                                     e.getValue().getSpeciality()));

    }

    public void detailedInfo() {

	System.out.print("Введите имя и фамилию работника : ");

	Master master = masters.getMasters().get(ConsoleService.input());
	
	if (master == null) {
	    System.out.println("Такого работника нет в базе");
	    
	} else {

	    System.out.printf("Ф.И.О. : %s\nВозраст : %s\n"
	                    + "Специальность : %s\n"
		            + "Дата приема на работу : %s\n",
		                                   master.getName(), 
		                                   master.getAge(), 
		                                   master.getSpeciality(), 
		                                   master.getRecruitDate());
	}

    }

}
