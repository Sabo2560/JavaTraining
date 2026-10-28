import java.util.Scanner;

public class WeightConvertApp {
    static void main(String[] args) {

        //WEIGHT CONVERSION APP

        // Declare Variables
        Scanner sc = new Scanner(System.in);

        double weight ;
        double newWeight;
        int choice;

        //Welcome Message
        System.out.println("WeightConvertApp.main");

        //prompt for user choice
        System.out.println("1) : Convert lbs to kgs");
        System.out.println("2) : Convert kgs to lbs");

        System.out.println("choose an option : ");
        choice = sc.nextInt();

        //option 1 convert lbs to kgs
        if (choice == 1) {
            System.out.println("Enter Weight in lbs : ");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;

            System.out.printf("The weight in kgs is %.2f kgs\n", newWeight);
        }
        // option 2 convert kgs to lbs
        else if (choice==2) {
            System.out.println("Enter Weight in Kg : ");
            weight = sc.nextDouble();
            newWeight = weight * 2.20462 ;

            System.out.printf("The weight in lbs is %.2f lbs\n", newWeight);
        }
        // else print not a valid choice
        else{
            System.out.println("Not a valid choice");
        }
        sc.close();
    }
}
