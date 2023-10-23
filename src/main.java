import java.util.Scanner;

public class main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Linkedlist<User> doubleList = new Linkedlist<User>();
        lalala(doubleList);
    }
    public static User register(Linkedlist doubleList){
        User user=null;
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
        if(doubleList.cpfValidator(newUserCpf)==true){
            user = new User(newUserName,newUserEmail,newUserCpf,newUserAge,passwordSize);
            System.out.println("Registered user!!!");
            return user;
        }else{
            System.out.println("User already registered!!!");
            return user;
        }
    }
    public static void lalala(Linkedlist doubleList){
        boolean loop=false;
        do {
            System.out.println("///// Password Generator /////"+
                    "\n(1)New User"+
                    "\n(2)List accounts"+
                    "\n(3)Remove User"+
                    "\n(4)Search User");
            int op = sc.nextInt();
            switch (op){
                case 1:
                    doubleList.add(register(doubleList));;
                    break;
                case 2:
                    System.out.println(doubleList.toString());
                    break;
                case 3:
                    System.out.println("Delete User by CPF:");
                    String userDelete = sc.next();
                    doubleList.deleteUser(userDelete);
                    break;
                case 4:
                    System.out.println("Search User by CPF:");
                    String userSearch = sc.next();
                    doubleList.search(userSearch);
                    break;
            }
        }while(loop=true);
    }
}
