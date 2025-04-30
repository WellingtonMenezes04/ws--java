package view;

import controller.UsuarioController;
import model.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CadastroUsuario extends JFrame {
    private JTextField txtNome, txtSobrenome, txtIdade, txtCpf;
    private JRadioButton rbMasculino, rbFeminino;
    private ButtonGroup grupoSexo;
    private JButton btnCadastrar;
    private JMenuBar menuBar;
    private JMenu menuUsuarios;
    private JMenuItem menuExibir;

    public CadastroUsuario() {
        setTitle("Cadastro de Usuários");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        // Campos
        add(new JLabel("Nome:"));
        txtNome = new JTextField();
        add(txtNome);

        add(new JLabel("Sobrenome:"));
        txtSobrenome = new JTextField();
        add(txtSobrenome);

        add(new JLabel("Idade:"));
        txtIdade = new JTextField();
        add(txtIdade);

        add(new JLabel("CPF:"));
        txtCpf = new JTextField();
        add(txtCpf);

        add(new JLabel("Sexo:"));

        JPanel painelSexo = new JPanel();
        rbMasculino = new JRadioButton("Masculino");
        rbFeminino = new JRadioButton("Feminino");
        grupoSexo = new ButtonGroup();
        grupoSexo.add(rbMasculino);
        grupoSexo.add(rbFeminino);
        painelSexo.add(rbMasculino);
        painelSexo.add(rbFeminino);
        add(painelSexo);

        // Botão Cadastrar
        btnCadastrar = new JButton("Cadastrar");
        add(btnCadastrar);

        // Espaço em branco
        add(new JLabel());

        // Menu
        menuBar = new JMenuBar();
        menuUsuarios = new JMenu("Usuários");
        menuExibir = new JMenuItem("Exibir");
        menuUsuarios.add(menuExibir);
        menuBar.add(menuUsuarios);
        setJMenuBar(menuBar);

        // Eventos
        btnCadastrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = txtNome.getText();
                String sobrenome = txtSobrenome.getText();
                int idade = Integer.parseInt(txtIdade.getText());
                String cpf = txtCpf.getText();
                String sexo = rbMasculino.isSelected() ? "Masculino" : "Feminino";

                Usuario u = new Usuario(nome, sobrenome, idade, cpf, sexo);
                UsuarioController.adicionarUsuario(u);
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            }
        });

        menuExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new ExibirUsuario().setVisible(true);
            }
        });
    }
}
