package Model;

public class Usuario {
    private String cpf;
    private String nome;
    private String sobrenome;
    private int idade;
    String sexo;

    public Usuario(String cpf, String nome, String sobrenome, int idade, boolean masculino) {
    this.cpf = cpf;
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.idade = idade;
    this.sexo = masculino ? "Masculino" : "Feminino";
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "CPF: " + cpf + "\nNome: " + nome + " " + sobrenome + "\nIdade: " + idade + "\nSexo: " + this.sexo;
    }
}
