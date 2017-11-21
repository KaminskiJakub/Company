
public class Company {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker("Adam", "Nowak", "Engineer", 1985, 'M', 3800, 72);
		Worker worker2 = new Worker("Marta", "Sosnowska", "Secretary", 1988, 'W', 3000, 60);
		Worker worker3 = new Worker("Piotr", "Kot", "Engineer", 1990, 'M' , 2800, 55);
		Worker worker4 = new Worker("Marek", "Jarosz", "Marketing Specialist", 1987, 'M' , 3500, 78);
		Worker worker5 = new Worker("Klaudia", "Molenda", "Sales Expert", 1976, 'W' , 4600, 80);
		Worker worker6 = new Worker("Tomasz", "Skitek", "Engineer", 1980, 'M', 5600, 82);
		
		System.out.println(worker1);
		worker1.sayHello();
		System.out.println(worker1.punctualSaying());
		
		Manager manager1 = new Manager("Marek", "Kantor", "Technical Manager", 1972, 'M', 8500, 85);
		Manager manager2 = new Manager("Krzysztof", "Hak", "Manager", 1970, 'M', 8500, 85);
		
		manager1.giveOrder();
		
		Director director = new Director("Jakub", "Górski", "Director", 1980, 'M', 14000, 90);
		
		director.giveCompliment();
		
		
		
	}

}
