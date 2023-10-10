import java.util.Arrays;
import java.util.Random;

public class User {
    StringBuilder password = new StringBuilder();
    private final String LETTERS ="abcdefghijklmnopqrstuvwxyz";
    private final String NUMBER ="0123456789";
    private final String ESPECIAL = " !@#$%&*?/\\  ";
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

    @Override
    public String toString() {
        return "\nUserName= " + userName +
                "\nPassword= " + password +
                "\nEmail= " + email +
                "\nCPF= " + cpf +
                "\nAge= " + age;
    }
}
