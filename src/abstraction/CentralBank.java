package abstraction;

public abstract class CentralBank {
	
	abstract void getBankName();
	abstract void getInterestRate() ;
	
	final void moneyExRate() {
		System.out.println("1$ = 80Rs");
		System.out.println("1$ = 0.85Euro");
		System.out.println("1$ = 110Yen");
	}

}
