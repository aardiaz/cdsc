package encapsulation;

import oops.Book;

public class Test {
	
public static void main(String[] args) {
	 
	Product  pd = new Product();
	
	pd.setId(3434);
	pd.setName("Mobile");
	pd.setCompany("CG");
	pd.setPrice(90000);
	
	System.out.println(pd);
	
//	System.out.println("Id = "+pd.getId());
//	System.out.println("Name  = "+pd.getName());
//	System.out.println("Company = "+pd.getCompany());
//	System.out.println("Price = "+pd.getPrice());
	
		
	}


}
