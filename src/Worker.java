public class Worker extends Employee implements Tasks {

	private int percentageHappiness;
	
	public Worker(String firstName, String secondName, String jobTitle, int yearOfBirth, char gender, double salary, int percentageHappiness) {
		super(firstName, secondName, jobTitle, yearOfBirth, gender, salary);
		this.percentageHappiness = percentageHappiness;
	}

	@Override
	public void presentYourself(String firstName, String secondName, String jobTitle) {
		
		
	}

	@Override
	public void sayHello() {
		System.out.println("Hello");
		
	}

	public double getPercentageHappiness() {
		return percentageHappiness;
	}

	public void setPercentageHappiness(int percentageHappiness) {
		this.percentageHappiness = percentageHappiness;
	}

	@Override
	public String punctualSaying() {
		return "Yes! I am earlier in work than I Should be";
	}

	@Override
	public String toString() {
		return super.toString() + "Worker [percentageHappiness=" + percentageHappiness + "]";
	}

	/*
	@Override
	public void workOnWeekends() {
		if (LocalDate.now() )
		
	}
	*/
	

}
