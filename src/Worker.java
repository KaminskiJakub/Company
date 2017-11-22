<<<<<<< HEAD
public class Worker extends Employee implements Tasks {

	private double salary;
	
	public Worker(String firstName, String secondName, String jobTitle, double salary) {
		super(firstName, secondName, jobTitle);
		this.salary = salary;
	}
	
	

	@Override
	public void presentYourself(String firstName, String secondName, String jobTitle) {
		
		
	}

	@Override
	public void sayHello() {
		System.out.println("Hello");
		
	}


	@Override
	public String punctualSaying() {
		return "Yes! I am earlier in work than I Should be";
	}



	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	@Override
	public String toString() {
		return super.toString() + ", salary=" + salary + "]";
	}

	

	
	

}
=======
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
>>>>>>> 681d41923e9ff554cb1be5de8e333a37de1a8483
