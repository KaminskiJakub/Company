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
