package inheritance;

public class Test {
	
	public static void main(String[] args) {
		
		Programmer p = new Programmer();

		p.id = 101;
		p.name = "John";
		p.salary = 50000;
		p.company = "Google";

		p.progLang = "Java";
		p.project = "AI";
		p.bonus = 10000;

		p.print();
		
	}

}
