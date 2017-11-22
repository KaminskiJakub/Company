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

	
}