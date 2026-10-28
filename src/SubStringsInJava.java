import java.util.Scanner;

public class SubStringsInJava {
    static void main(String[] args) {
        // .substring is a method used to extract a portion of a string
        // syntaxe : .substring(start, end)

        Scanner sc = new Scanner(System.in);
        System.out.println("SubStringsInJava.main");

        String email;
        String domain;
        String username;

        System.out.print("Enter you E-mail : ");
        email = sc.nextLine();

        if (email.contains("@")) {
            // if true perform this action
            username = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") +1);

            System.out.printf("Your username is : %s\n", username);
            System.out.printf("Your Domain is : %s\n", domain);
        }else {
            System.out.println("Emails Contain '@' Sign !");
        }

        sc.close();
    }
}
