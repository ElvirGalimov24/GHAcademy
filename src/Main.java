import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String name = "Elvir";

        System.out.println("Enter your role (Admin, User, Guest): ");
        String role = scanner.nextLine().trim();

        switch (role.toLowerCase()){
            case "admin":
                System.out.println("You have full access.");
                break;
            case "user":
                System.out.println("You have limited access.");
                break;
            case "guest":
                System.out.println("You have guest access.");
                break;
            default:
                System.out.println("Invalid role entered!");
        }
scanner.close();
        }
    }
