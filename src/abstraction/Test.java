package abstraction;

public class Test {
	
	public static void main(String[] args) {
		
		CentralBank centralBank = new PrabhuBank();
		centralBank.getBankName();
		centralBank.getInterestRate();
		centralBank.moneyExRate();
		
		UserService userService = new UserServiceImpl();
		userService.addUser();
		userService.deleteUser();
		userService.print();
		
//		CommonService commonService = new UserServiceImpl();
//		commonService.print();
		
		
		
	}

}
