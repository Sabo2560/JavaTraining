import java.util.Scanner;

public class LogicalOperatorsJava {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // && : AND
        // || : OR
        // ! : NOT

        String username;

        // username : must be between 4 and 12 Characters
        // username : must not contain spaces or underscores

        System.out.println("LogicalOperatorsJava.main");
        System.out.println("Enter your Username : (4 to 12 Characters, No spaces or underscores) ");
        username = sc.nextLine();

        if ((username.length() > 12) || (username.length() < 4)) {
            System.out.println("Not again more than 4 and less that 12");
        } else if (username.contains(" ") || username.contains("-")) {
            System.out.println("Username Should not contain Spaces or Underscores");
        }else {
            System.out.printf("your username is %s , welcome",username );
        }


        sc.close();
    }
}
