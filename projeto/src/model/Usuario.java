package model;

public class Usuario {
	
	 	private String nome;
	    private String sobrenome;
	    private int idade;
	    private String cpf;
	    private String sexo;

	    public Usuario(String nome, String sobrenome, int idade, String cpf, String sexo) {
	        this.nome = nome;
	        this.sobrenome = sobrenome;
	        this.idade = idade;
	        this.cpf = cpf;
	        this.sexo = sexo;
	    }

	    public String getNome() { return nome; }
	    public String getSobrenome() { return sobrenome; }
	    public int getIdade() { return idade; }
	    public String getCpf() { return cpf; }
	    public String getSexo() { return sexo; }

	    @Override
	    public String toString() {
	        return nome + " " + sobrenome + ", " + idade + " anos, " + sexo + ", CPF: " + cpf;
	    }
}
