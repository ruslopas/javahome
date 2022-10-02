package by.itacademy.hw18.task2;

import by.itacademy.hw18.task2.annotation.AcademyInfo;

public class TestAnnotation {

    @AcademyInfo()
    public void getDefaultAnno() {

    }

    public void getWithoutAnno() {

    }

    @AcademyInfo(year = 1999)
    public void getGivenAnno() {

    }

}
