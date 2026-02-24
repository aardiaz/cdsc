package methodoverriding;

public class CentralBank {
	
	void getBankName() {
		System.out.println("Central Bank");
	}
	
	void getInterestRate() {
		System.out.println("0%");
	}
	
	final void moneyExRate() {
		System.out.println("1$ = 80Rs");
		System.out.println("1$ = 0.85Euro");
		System.out.println("1$ = 110Yen");
	}

}
