<<<<<<< HEAD

public class Director extends Manager implements Orders {

	private int inCompanyFrom;

	public Director(String firstName, String secondName, String jobTitle, double salary, int percentageHappiness, int inCompanyFrom) {
		super(firstName, secondName, jobTitle, salary, percentageHappiness);
		this.inCompanyFrom = inCompanyFrom;
	}

	public int getInCompanyFrom() {
		return inCompanyFrom;
	}

	public void setInCompanyFrom(int inCompanyFrom) {
		this.inCompanyFrom = inCompanyFrom;
	}

	
	
	
	

}
=======

public class Director extends Manager implements Orders {

	public Director(String firstName, String secondName, String jobTitle, int yearOfBirth, char gender, double salary, int percentageHappiness) {
		super(firstName, secondName, jobTitle, yearOfBirth, gender, salary, percentageHappiness);
		
	}
	
	

}
>>>>>>> 681d41923e9ff554cb1be5de8e333a37de1a8483
