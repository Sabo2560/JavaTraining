import java.util.Scanner;

public class SwitchesEnhancedJava {
    static void main(String[] args) {
        // Enhanced switches is a more efficient replacement to many else if statement
        // Java 14 feature ()

        Scanner sc = new Scanner(System.in);

        String day;
        String firstLetter;
        System.out.println("SwitchesEnhancedJava.main");
        System.out.print("Enter a day : ");
        day = sc.nextLine();

        switch (day){
            case "Monday","Tuesday","Wednesday","Thursday","Friday" ->
                    System.out.println("it's A Weekday, Slave AWAY !");
            case "Sunday", "Saturday" ->
                    System.out.println("it's a Weekend, Drinks On ME !");
            default ->
                    System.out.println(day + " Is not a Day Dude !");
        }
        sc.close();
    }
}
