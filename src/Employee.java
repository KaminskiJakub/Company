<<<<<<< HEAD
public abstract class Employee {

	private String firstName;
	private String secondName;
	private String jobTitle;
	
	public Employee(String firstName, String secondName, String jobTitle) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.jobTitle = jobTitle;
	}
	
	public abstract String punctualSaying();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName=" + secondName + ", jobTitle=" + jobTitle + "";
	}

	
	


	
	
=======
public abstract class Employee {

	private String firstName;
	private String secondName;
	private String jobTitle;
	private int yearOfBirth;
	private char gender;
	private double salary;
	
	public Employee(String firstName, String secondName, String jobTitle, int yearOfBirth, char gender, double salary) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.jobTitle = jobTitle;
		this.yearOfBirth = yearOfBirth;
		this.gender = gender;
		this.salary = salary;
	}
	
	public abstract String punctualSaying();

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName=" + secondName + ", jobTitle=" + jobTitle
				+ ", yearOfBirth=" + yearOfBirth + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
	
>>>>>>> 681d41923e9ff554cb1be5de8e333a37de1a8483
}