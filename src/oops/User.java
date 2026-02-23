package oops;

public class User {
	
	//instance variable
	String username;
	String password;
	
	//create default constructor
	User(){
		username = "root";
		password = "123";
	}
	
	User(String password){
		this.password = password;
	}
	
	//---------- parameterized constructor ----------
	User(String username, String password){
		
		 // this();//calling default const.
		 // this(3434,4545);//calling param. conts.
		
		this.username = username;
		this.password = password;//calling instance variables.
		
		
		//this.printUser();//calling instance method
		
		/*
		 * 'this' represents current object.
		 *  using 'this' keyword we can call :
		 *  
		 *    - instance variables.
		 *    - instance methods.
		 *    - constructors
		 */
	}
	
	void printUser() {
		
		System.out.println("UserName = "+username);
		System.out.println("Pasword = "+password);
	}
	
	public static void main(String[] args) {
		User  u  = new User("hari", "67868");
		u.printUser();
		
		User u2;
		
		int a;
		a= 34334;
		
		  u2= new User();
		 
		 /**
		  * Class {@code Object} is the root of the class hierarchy.
		  * Every class has {@code Object} as a superclass. All objects,
		  * including arrays, implement the methods of this class.
		  *
		  */
	}

}
