package lab_java;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Gerente> gerentes = new ArrayList<>();


        Funcionario f1 = new Funcionario("Carlos Silva", 12345678900L, new Data(15, 3, 1985), new Data(10, 2, 2015), 4500.00);
        Funcionario f2 = new Funcionario("Ana Souza", 98765432100L, new Data(22, 7, 1990), new Data(5, 6, 2018), 5200.00);


        Gerente g1 = new Gerente("Mariana Lopes", 11223344556L, new Data(10, 9, 1978), new Data(20, 4, 2010), 9500.00, 1, new Data(5, 1, 2015));
        Gerente g2 = new Gerente("Roberto Martins", 66554433221L, new Data(3, 12, 1980), new Data(15, 8, 2008), 10500.00, 2, new Data(10, 5, 2013));


        funcionarios.add(f1);
        funcionarios.add(f2);

        gerentes.add(g1);
        gerentes.add(g2);


        System.out.println("Lista de Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        System.out.println("\nLista de Gerentes:");
        for (Gerente g : gerentes) {
            System.out.println(g);
        }
    }
}
