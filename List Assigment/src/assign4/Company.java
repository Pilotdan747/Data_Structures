package assign4;

public class Company {

	String ticker;
	String name;
	TransactionList transactions;
	
	public Company(String ticker, String name) {
		this.ticker = ticker;
		this.name = name;
		
		transactions = new TransactionList();
	}
	
	public int calculateGains() {
		int gains = 0;
		
		return gains;
	}
}
