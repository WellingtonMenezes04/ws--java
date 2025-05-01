package entities;

public abstract class Pessoa {
	private String name;
	private double amount;

	public Pessoa() {

	}

	public Pessoa(String name, double amount) {
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public abstract double payment();
	
	
	
	
	
	
}
