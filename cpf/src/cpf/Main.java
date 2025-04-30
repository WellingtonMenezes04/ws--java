package cpf;

import java.util.Scanner;

class CpfInvalidoException extends Exception {
    public CpfInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String sobrenome, int idade, String cpf) throws CpfInvalidoException {
        if (cpf.contains(".") || cpf.contains("-")) {
            throw new CpfInvalidoException("Erro: o CPF não deve conter ponto (.) ou hífen (-).");
        }
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome completo: " + nome + " " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = null;

        while (pessoa == null) {
            try {
                System.out.print("Digite o nome: ");
                String nome = sc.nextLine();

                System.out.print("Digite o sobrenome: ");
                String sobrenome = sc.nextLine();

                System.out.print("Digite a idade: ");
                int idade = Integer.parseInt(sc.nextLine());

                System.out.print("Digite o CPF (sem ponto ou hífen): ");
                String cpf = sc.nextLine();

                pessoa = new Pessoa(nome, sobrenome, idade, cpf);
            } catch (CpfInvalidoException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Erro: idade deve ser um número inteiro.");
            }
        }

        pessoa.exibirDados();
        sc.close();
    }
}
