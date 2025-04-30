package Control;

import Model.Usuario;
import java.util.ArrayList;
import View.Janela;

public class Controller {
    private final ArrayList<Usuario> usuarios = new ArrayList<>();
    private final Janela janela;
    
    public Controller(Janela janela) {
        this.janela = janela;
    }

    private boolean verificaCPFexiste(String cpf) {
        for (Usuario user : usuarios) {
            if (user.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void cadastrar(String CPF, String nome, String sobrenome, int idade, boolean masculino) {
        if (verificaCPFexiste(CPF)) {
            System.out.println("CPF ja utlizado");
            return;
        }

        Usuario user = new Usuario(CPF, nome, sobrenome, idade, masculino);
        usuarios.add(user);
        System.out.println("Usuário cadastrado: " + user);
    }

    public void consultar(String CPF) {
        for (Usuario user : usuarios) {
            if (CPF.equals(user.getCpf())) {
                janela.getOutputUser().setText(user.toString());
                return;
            }
        }
        janela.getOutputUser().setText("Usuário não encontrado.");
    }
}
