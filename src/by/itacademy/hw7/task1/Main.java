package by.itacademy.hw7.task1;

/*Реализуйте класс студента и аспиранта.Аспирант отличается от студента наличием научной работы.
 * Студент обладает следующими характеристиками имя,фамилия,номер курса,название группы,средняя оценка.
 * У студента должен быть реализован метод,возвращающий сумму стипендии,которая рассчитывается следующим 
 * образом:если средняя оценка равна 5,то сумма 100,иначе 80. Стипендия аспиранта рассчитывается иначе:
 * если средняя оценка равна 5,то сумма 200,иначе 180.
 *  Продемонстрировать работу программы,создав массив,содержащий студентов и аспирантов.
 *  Вывести на экран информацию о каждом студенте и аспиранте(имя,фамилия,номер курса,
 *  название группы,средняя оценка,размер стипендии).*/

public class Main {

	public static void main(String[] args) {

		Student[] students = new Student[5];

		students[0] = new GraduateStudent("Michael", "Jordan", "Bulls", 1, 5.5,"Fine work in deffence.");
		students[1] = new Student("Lebron", "James", "Lakers", 2, 4);
		students[2] = new Student("Koby", "Bryant", "Lakers", 2, 5);
		students[3] = new Student("Scotty", "Pippen", "Bulls", 1, 4);
		students[4] = new Student("Shaquille", "O'Neal", "Magic", 3, 4.5);

		for (Student student : students) {
			System.out.println(student.getInfo());

		}

	}

}
