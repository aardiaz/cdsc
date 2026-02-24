package methodoverriding;

public class Test {
	
	public static void main(String[] args) {
		
		//static or early binding of object
		PrabhuBank prabhu = new PrabhuBank();
		prabhu.getBankName();
		prabhu.getInterestRate();
		
		//up-casting or late binding of object
		CentralBank  bank = new NabilBank();
		
	}
	
	//dynamic or late binding of object
	//runtime polymorphism
	static void printBankInfo(CentralBank bank) {
		bank.getBankName();
		bank.getInterestRate();
	  
  }

}
