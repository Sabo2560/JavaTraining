import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class BankingSystemJava {

    static Scanner sc = new Scanner(System.in);

    static void main(String[] args) {
        // JAVA Banking System
        // Variable Declaration
        double balance = 0.0;
        boolean isRunning = true;
        int choice = 0;

        while (isRunning){
            // Display Menu
            System.out.println("************************");
            System.out.println("Banking System Java_main");
            System.out.println("************************");
            // MENU Options
            System.out.println("1. Show Balance.");
            System.out.println("2. Deposit.");
            System.out.println("3. Withdraw.");
            System.out.println("4. EXIT.");
            System.out.println("************************");
            System.out.print("Enter your choice (1-4) : ");

            // Get and process user choices
            choice = sc.nextInt();
            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice (1 - 4)");

        }
    }

    }
    // ShowBalance() Method
    static void showBalance(double balance){
        System.out.println("Banking System, Show Balance");
        System.out.printf("%.2f MAD\n", balance);
    }

    // Deposit() Method
    static double deposit(){
        double amount;
        System.out.println("Enter The Deposit Amount : ");
        amount = sc.nextDouble();
        if (!sc.hasNextInt()){
            System.out.println("Please Enter the amount in numbers only !");
            return 0;
        }else if (amount < 0){
            System.out.println("Amount Entered is Negative !");
            return 0;
        }else {
            return amount;
        }
    }

    // Withdraw() Method
    static double withdraw(double balance) {
        double amount;
        System.out.println("Enter Desired Amount :");
        amount = sc.nextDouble();
        if (amount > balance){
            System.out.println("Insufficient Funds ! ");
            return 0;
        } else if (amount < 0 ) {
            System.out.println("Amount cant be negative");
            return 0;
        }else {
            return amount;
        }
    }

}
