package by.itacademy.hw7.task1;

public class GraduateStudent extends Student {

	private String scienсeWork;
	
	public GraduateStudent(String name, String lastName, String groupName, int groupNumber, double averageRating) {
		super(name, lastName, groupName, groupNumber, averageRating);

	}

	public GraduateStudent(String name, String lastName, String groupName, int groupNumber, double averageRating,
			String scienceWork) {
		super(name, lastName, groupName, groupNumber, averageRating);
		this.scienсeWork = scienceWork;
	}

	public String getScienceWork() {
		return scienсeWork;
	}

	public String setScienceWork() {
		return this.scienсeWork;
	}

	@Override
	public int getScholarshipSum() {
		if (getAverageRating() >= 5) {
			return 200;
		}
		return 180;
	}

	public String getInfo() {
		return "Name : " + getName() + "\nLast name : " + getLastName() + "\nGroup name : " + getGroupName()
				+ "\nGroup number : " + getGroupNumber() + "\nAverage rating : " + getAverageRating()
				+ "\nScholarship : " + getScholarshipSum() + "\nScience work : \"" + getScienceWork() + "\"\n";
	}
}