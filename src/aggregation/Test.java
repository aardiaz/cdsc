package aggregation;

public class Test {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("Red", "BMW", 5000000);
		
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("John");
		emp1.setSalary(50000);
		emp1.setCar(car1);
		
		System.out.println("Employee Details:");
		System.out.println("ID: " + emp1.getId());
		System.out.println("Name: " + emp1.getName());
		System.out.println("Salary: " + emp1.getSalary());
		System.out.println("Car Details:");
		System.out.println("Color: " + emp1.getCar().getColor());
		System.out.println("Model: " + emp1.getCar().getModel());
		System.out.println("Price: " + emp1.getCar().getPrice());
		
		
	}

}
