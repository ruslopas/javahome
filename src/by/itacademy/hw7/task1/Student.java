package by.itacademy.hw7.task1;

public class Student {

	private String name;
	private String lastName;
	private String groupName;
	private int groupNumber;
	private double averageRating;

	public Student(String name, String lastName, String groupName, int groupNumber, double averageRating) {
		this.name = name;
		this.lastName = lastName;
		this.groupName = groupName;
		this.groupNumber = groupNumber;
		this.averageRating = averageRating;
	}

	public String getName() {
		return name;

	}

	public String getLastName() {
		return lastName;
	}

	public String getGroupName() {
		return groupName;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public double getAverageRating() {
		return averageRating;

	}

	public int getScholarshipSum() {
		if (averageRating >= 5) {
			return 100;
		}
		return 80;
	}

	public String getInfo() {
		return "Name : " + name + "\nLast name : " + lastName + "\nGroup name : " + groupName + "\nGroup number : "
				+ groupNumber + "\nAverage rating : " + averageRating + "\nScholarship : " + getScholarshipSum() + "\n";

	}

}
