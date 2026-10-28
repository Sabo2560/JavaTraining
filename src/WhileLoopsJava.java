import java.util.Scanner;

public class WhileLoopsJava {
    static void main(String[] args) {
        // While loop : execute a portion of the code while a condition is true
        // while some condition = true -> run the code
        Scanner sc = new Scanner(System.in);

        //        String name = "";
        //
        //        while (name.isEmpty()) {
        //            System.out.println("Enter your name : ");
        //            name = sc.nextLine();
        //        }
        //        System.out.printf("your name is %s !\n",name);

//        String response = "";
//        System.out.println("WhileLoopsJava.main");
//
//        while (!response.equals("S")) {
//            System.out.println("You are in a game !");
//            System.out.println("Hit S to Quit ! ");
//            response = sc.nextLine().toUpperCase();
//        }
//        System.out.println("You have left successfully ! ");
//

        int age = 0;
        do{
            System.out.println("Your age can't be negative");
            System.out.println("Enter your age");
            age = sc.nextInt();
        } while (age < 0);

            System.out.println("you are " + age + "Years old");

        sc.close();
    }
}
