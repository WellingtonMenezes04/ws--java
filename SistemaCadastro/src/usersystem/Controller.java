package usersystem;

import java.util.ArrayList;

public class Controller {
    private final ArrayList<User> users = new ArrayList<>();
    private final Window window;

    // Constructor
    public Controller(Window window) {
        this.window = window;
    }

    // Check if CPF already exists
    private boolean doesCpfExist(String cpf) {
        for (User user : users) {
            if (user.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    // Register a new user
    public void register(String cpf, String firstName, String lastName, int age, boolean isMale) {
        if (doesCpfExist(cpf)) {
            System.out.println("CPF already in use");
            return;
        }

        User user = new User(cpf, firstName, lastName, age, isMale);
        users.add(user);
        System.out.println("User registered: " + user);
    }

    // Consult user by CPF
    public void consult(String cpf) {
        for (User user : users) {
            if (cpf.equals(user.getCpf())) {
                window.getOutputField().setText(user.toString());
                return;
            }
        }
        window.getOutputField().setText("User not found.");
    }
}
