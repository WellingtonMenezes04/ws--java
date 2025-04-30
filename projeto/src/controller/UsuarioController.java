package controller;

import model.Usuario;
import java.util.ArrayList;

public class UsuarioController {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static Usuario buscarPorCPF(String cpf) {
        for (Usuario u : usuarios) {
            if (u.getCpf().equals(cpf)) return u;
        }
        return null;
    }
}
