public class Company {

	public static void main(String[] args) {
		
		Worker worker1 = new Worker("Adam", "Nowak", "Engineer", 3500);
		Worker worker2 = new Worker("Marta", "Sosnowska", "Secretary", 3800);
		Worker worker3 = new Worker("Piotr", "Kot", "Engineer", 3500);
		Worker worker4 = new Worker("Marek", "Jarosz", "Marketing Specialist", 4100);
		Worker worker5 = new Worker("Klaudia", "Molenda", "Sales Expert", 4500);
		Worker worker6 = new Worker("Tomasz", "Skitek", "Engineer", 4000);
		
		
		System.out.println(worker1);
		worker1.sayHello();
		System.out.println(worker1.punctualSaying());
		
		Manager manager1 = new Manager("Marek", "Kantor", "Technical Manager", 8500, 80);
		Manager manager2 = new Manager("Krzysztof", "Hak", "Manager", 8500, 85);
		
		manager1.giveOrder();
		
		Director director = new Director("Jakub", "Górski", "Director", 14000, 90, 2007);
		
		director.giveCompliment();
		
	}

}
