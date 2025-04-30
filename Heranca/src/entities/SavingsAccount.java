package entities;

public class SavingsAccount extends Account{
		
	private Double interestrate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestrate) {
		super(number, holder, balance);
		this.interestrate = interestrate;
	}

	public Double getInterestrate() {
		return interestrate;
	}

	public void setInterestrate(Double interestrate) {
		this.interestrate = interestrate;
	}
	
	public void upDateBalance() {
		
		balance += balance * interestrate;
		
	}
	
	@Override
	public void withDraw(double amount) {
		balance -= amount;
		
	}
	
	
}
