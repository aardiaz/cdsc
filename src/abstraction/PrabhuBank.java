package abstraction;

public class PrabhuBank extends CentralBank {

	@Override
	void getBankName() {
		System.out.println("Prabhu Bank");
	}

	@Override
	void getInterestRate() {
		System.out.println("Prabhu Bank Interest Rate: 8%");
	}
}
