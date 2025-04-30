package entities;

public final class OutsourcedEmployee extends Employee {

	
	private Double amount;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double amount) {
		super(name, hours, valuePerHour);
		this.amount = amount;
	}
	
	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	public double payment() {
		return super.payment()+ (1.01 * amount);
	}

	
}
