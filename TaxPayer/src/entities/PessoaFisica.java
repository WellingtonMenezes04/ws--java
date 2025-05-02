package entities;

public final class PessoaFisica extends Pessoa{
	
	private Double healthcare;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String name, double amount, Double healthcare) {
		super(name, amount);
		this.healthcare = healthcare;
	}

	public Double getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(Double healthcare) {
		this.healthcare = healthcare;
	}

	@Override
	public double payment() {
		if(getAmount() < 20000) {
			return (getAmount() * 0.15) - (healthcare * 0.5);
		}else {
			return (getAmount() * 0.25) - (healthcare * 0.5);
		}
	}
	

}
