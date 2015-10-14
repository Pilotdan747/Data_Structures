package wk1;

public class BankAccount {

	private double balence;
	private String acctNumber;
	
	
	public BankAccount(double balence, String acctNumber) {
		this.balence = balence;
		this.acctNumber = acctNumber;
	}
	
	
	/**
	 * @return the balence
	 */
	public double getBalence() {
		return balence;
	}
	/**
	 * @param balence the balence to set
	 */
	public void setBalence(double balence) {
		this.balence = balence;
	}
	/**
	 * @return the acctNumber
	 */
	public String getAcctNumber() {
		return acctNumber;
	}
	/**
	 * @param acctNumber the acctNumber to set
	 */
	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BankAccount [balence=" + balence + ", acctNumber=" + acctNumber + "]";
	}
	
	
}
