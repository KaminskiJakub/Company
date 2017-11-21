
public class Manager extends Worker implements Tasks, Orders {

	public Manager(String firstName, String secondName, String jobTitle, int yearOfBirth, char gender, double salary, int percentageHappiness) {
		super(firstName, secondName, jobTitle, yearOfBirth, gender, salary, percentageHappiness);
	
	}

	@Override
	public void giveOrder() {
		System.out.println("We have a deadline coming. Go back to work");
		
	}

	@Override
	public void giveCompliment() {
		System.out.println("Nice job. Keep it going!");
		
	}

	@Override
	public void giveAdvice() {
		System.out.println("If You don't know how to do it and You can't find an answer in google, just come to me.");
		
	}

	@Override
	public void giveWarning() {
		System.out.println("I can not tolerate that kind of behavior. You need to change Your attitude.");
		
	}

	
}
