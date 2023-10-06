import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        lalala();
    }
    public static User register(){
        System.out.println("Username:");
        String newUserName = sc.next();
        System.out.println("Size of password?");
        int passwordSize = sc.nextInt();
        User teste = new User(newUserName,passwordSize);
        System.out.println(teste.toString());
        return teste;
    }
    public static void lalala(){
        boolean loop=false;
        do {
            System.out.println("///// Password Generator /////"+
                    "\n(1)New User"+
                    "\n(2)List accounts");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    register();
                    break;
                case 2:
                    register().toString();
            }
        }while(loop=true);

    }
}
