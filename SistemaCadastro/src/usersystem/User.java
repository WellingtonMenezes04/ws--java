package usersystem;

public class User {
    private String cpf;
    private String firstName;
    private String lastName;
    private int age;
    private String gender;

    // Constructor
    public User(String cpf, String firstName, String lastName, int age, boolean isMale) {
        this.cpf = cpf;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = isMale ? "Male" : "Female";
    }

    // Getters and Setters
    public String getCpf() {
        return cpf;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CPF: " + cpf + "\nName: " + firstName + " " + lastName + "\nAge: " + age + "\nGender: " + this.gender;
    }
}
