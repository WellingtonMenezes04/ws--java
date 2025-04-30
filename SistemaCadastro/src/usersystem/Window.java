package usersystem;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {
    private JTextField firstNameField, lastNameField, ageField, cpfField, cpfConsultField, outputField;
    private JRadioButton maleOption, femaleOption;
    private Controller controller;
    private ButtonGroup buttonGroup;

    // Constructor
    public Window() {
        this.controller = new Controller(this);  // Pass the current Window instance to the controller
        initComponents();  // Call the method to initialize the components
    }

    private void initComponents() {
        buttonGroup = new ButtonGroup();
        firstNameField = new JTextField();
        lastNameField = new JTextField();
        ageField = new JTextField();
        cpfField = new JTextField();
        cpfConsultField = new JTextField();
        outputField = new JTextField();
        outputField.setEditable(false); // Disables editing of the output field

        maleOption = new JRadioButton("Male");
        femaleOption = new JRadioButton("Female");

        buttonGroup.add(maleOption);
        buttonGroup.add(femaleOption);

        // Register button
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cpf = cpfField.getText();
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                int age = Integer.parseInt(ageField.getText());
                boolean isMale = maleOption.isSelected();
                controller.register(cpf, firstName, lastName, age, isMale);
            }
        });

        // Consult button
        JButton consultButton = new JButton("Consult");
        consultButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                String cpf = cpfConsultField.getText();
                controller.consult(cpf);
            }
        });

        // Registration panel
        JPanel registrationPanel = new JPanel();
        registrationPanel.add(new JLabel("First Name:"));
        registrationPanel.add(firstNameField);
        registrationPanel.add(new JLabel("Last Name:"));
        registrationPanel.add(lastNameField);
        registrationPanel.add(new JLabel("Age:"));
        registrationPanel.add(ageField);
        registrationPanel.add(new JLabel("CPF:"));
        registrationPanel.add(cpfField);
        registrationPanel.add(new JLabel("Gender:"));
        registrationPanel.add(maleOption);
        registrationPanel.add(femaleOption);
        registrationPanel.add(registerButton);

        // Consultation panel
        JPanel consultationPanel = new JPanel();
        consultationPanel.add(new JLabel("CPF:"));
        consultationPanel.add(cpfConsultField);
        consultationPanel.add(consultButton);
        consultationPanel.add(outputField);

        // Tabbed Pane
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Register", registrationPanel);
        tabbedPane.addTab("Consult", consultationPanel);

        add(tabbedPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    // Getters
    public JTextField getOutputField() {
        return outputField;
    }

    public JTextField getCpfField() {
        return cpfField;
    }

    public JTextField getCpfConsultField() {
        return cpfConsultField;
    }
}
