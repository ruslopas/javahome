package by.itacademy.hw20.task1.entity;

import java.time.LocalDate;

public class Master {

    private String name;
    private String speciality;
    private String age;
    private final LocalDate recruitDate = LocalDate.now();

    public Master(String name, String age, String speciality) {
	this.name = name;
	this.age = age;
	this.speciality = speciality;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getSpeciality() {
	return speciality;
    }

    public void setSpeciality(String speciality) {
	this.speciality = speciality;
    }

    public String getAge() {
	return age;
    }

    public void setAge(String age) {

	this.age = age;
    }

    public LocalDate getRecruitDate() {
	return recruitDate;
    }

}
