import java.util.Scanner;

public class App {
    private static DataBase database = new DataBase();
    private static User currentUser = null;
    private static Scanner input = new Scanner(System.in);

    public static User createUser() {
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your mail: ");
        String mail = input.nextLine();
        System.out.print("Enter your phone: ");
        String phone = input.nextLine();
        System.out.println("Now your login info...");
        Login login = createLogin();

        return new User(name, mail, phone, login);
    }
    
    public static Login createLogin() {
        System.out.print("Enter a username: ");
        String username = input.nextLine();
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        return new Login(username, password);
    }

    public static void main(String[] args) {

        int choice = 0;
        do {
            System.out.println("+++ FinTech +++");
            if(currentUser != null) {
                System.out.println("Hello " + currentUser);
            }
            System.out.println("Choose a option:");
            System.out.println("1 - Register user;");
            System.out.println("2 - Login user;");

            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    User tempUser = createUser();
                    database.addUser(tempUser);
                    break;

                case 2:
                    Login tempLogin = createLogin();
                    currentUser = database.loginUser(tempLogin);
                    if(currentUser == null) {
                        System.out.println("Failed to login! Try again.");
                    }
                    break;
        
                default:
                    break;
            }
        } while(choice != 0);




        input.close();
    }

}