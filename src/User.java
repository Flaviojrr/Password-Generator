import java.util.Arrays;
import java.util.Random;

public class User {
    StringBuilder password = new StringBuilder();
    private final String LETTERS ="abcdefghijklmnopqrstuvwxyz";
    private final String NUMBER ="0123456789";
    private final String ESPECIAL = "!@#$%&*?/\\";
    private final char[] ALPHANUMERIC = (LETTERS+LETTERS.toUpperCase()+NUMBER+ESPECIAL).toCharArray();
    private String userName;
    private String email;
    private String cpf;
    private int age;

    public User(String userName, String email, String cpf, int age,int size) {
        this.userName = userName;
        this.email = email;
        this.cpf = cpf;
        this.age = age;
        passwordGenerator(size);
    }

    public String passwordGenerator(int size){
        for (int i=0;i<size;i++){
            password.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);
        }
        return password.toString();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nUserName= " + userName +
                "\nEmail= " + email +
                "\nCPF= " + cpf +
                "\nAge= " + age;
    }
}
