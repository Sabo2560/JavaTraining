import java.util.Scanner;

public class OperatorTrainningJava {
    static void main(String[] args) {
        // Operator
        Scanner sc = new Scanner(System.in);

        int number;
        int result = 0;

        boolean evenOrOdd = true;

        System.out.println("************************************");
        System.out.println(" ODD || EVEN Operator Trainning Game");
        System.out.println("************************************");
        System.out.print("Enter your number : \n");

        if (sc.hasNextInt()){
            number = sc.nextInt();
            sc.nextLine();
            result = number %  2;
            switch (result) {
                case 0 : System.out.printf("%d is an Even Number \n",number);
                break;
                case 1 : System.out.printf("%d is an ODD Number \n", number);
                break;
                default : System.out.println("#");
            }
        }
        else {
            System.out.print("You didn't Enter a valid Number.");
        }
        sc.close();
    }
}
