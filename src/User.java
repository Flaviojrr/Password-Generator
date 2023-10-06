import java.util.Random;

public class User {
    StringBuilder password = new StringBuilder();
    private final String LETTERS ="abcdefghijklmnopqrstuvwxyz";
    private final String NUMBER ="0123456789";
    private final String ESPECIAL = " !@#$%&*?/\\  ";
    private final char[] ALPHANUMERIC = (LETTERS+LETTERS.toUpperCase()+NUMBER+ESPECIAL).toCharArray();
    private String userName;

    public User(String userName, int size) {
        this.userName = userName;
        passwordGenerator(size);
        System.out.println("New registered user ");
    }

    public String passwordGenerator(int size){
        for (int i=0;i<size;i++){
            password.append(ALPHANUMERIC[new Random().nextInt(ALPHANUMERIC.length)]);
        }
        return password.toString();
    }

    @Override
    public String toString() {
        return "User{" +
                "userName=" + userName +
                ", password='" + password+"}";
    }
}
