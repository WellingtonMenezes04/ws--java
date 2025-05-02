package entities;

public final class PessoaJuridica extends Pessoa{
	
	private Integer employees;

	public PessoaJuridica() {
		super();
	}

	public PessoaJuridica(String name, double amount, Integer employees) {
		super(name, amount);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double payment() {
		if(employees > 10) {
			return (getAmount() * 0.14);
		} else {
			return (getAmount() * 0.16);
		}
	}
	
	
}
