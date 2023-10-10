import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Linkedlist<User> doubleList = new Linkedlist<User>();
        lalala(doubleList);
    }
    public static User register(){
        System.out.print("Username:");
        sc.nextLine();
        String newUserName= sc.nextLine();
        System.out.print("Email:");
        String newUserEmail = sc.next();
        sc.nextLine();
        System.out.print("CPF:");
        String newUserCpf = sc.next();
        System.out.print("Age:");
        int newUserAge = sc.nextInt();
        System.out.print("Size of password?");
        int passwordSize = sc.nextInt();
        User user = new User(newUserName,newUserEmail,newUserCpf,newUserAge,passwordSize);
        System.out.println(user.toString());
        return user;
    }
    public static void lalala(Linkedlist doubleList){
        boolean loop=false;
        do {
            System.out.println("///// Password Generator /////"+
                    "\n(1)New User"+
                    "\n(2)List accounts");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    doubleList.add(register());
                    break;
                case 2:
                    System.out.println(doubleList.toString());
            }
        }while(loop=true);

    }
}
