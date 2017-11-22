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
