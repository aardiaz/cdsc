package arrayofobject;

import java.util.Scanner;

public class Test {

	/*
	 * # syntax :
	 * 
	 * class_name array_name[] = new class_name[size];
	 * 
	 */

	public static void main(String[] args) {

		// store and print data of 10 products
		 
		Product[] products = getProducts();

		printProducts(products);

		// total price
		int totalPrice = findTotalPrice(products);
		System.out.println("Total price of all products is " + totalPrice);
	}

	private static int findTotalPrice(Product[] products) {
		int totalPrice = 0;
		for (Product pd : products) {
			//System.out.println(pd);
			if(pd.getCompany().equalsIgnoreCase("CG")) {
			     totalPrice = totalPrice + pd.getPrice();
			}
		}
		return totalPrice;
	}

	private static void printProducts(Product[] products) {
		// get data from products
		for (Product pd : products) {

			System.out.println(pd);
		}
	}

	private static Product[] getProducts() {
		Product products[] = new Product[3];

		// put data in array
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < products.length; i++) {

			Product p = new Product();
			System.out.println("Enter id");
			p.setId(sc.nextInt());
			System.out.println("Enter name");
			p.setName(sc.next());
			p.setPrice(10000);
			p.setCompany("Samsung");

			products[i] = p;
		}
		return products;
	}

}
