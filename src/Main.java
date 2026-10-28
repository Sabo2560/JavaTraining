import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        String name;
        boolean isStudent;

        System.out.println("What is your age ? : ");
        age = sc.nextInt();
        sc.nextLine();

        System.out.println("What is your Name : ");
        name = sc.nextLine();

        System.out.println("Are you a Student : (true / false Answers) ");
        isStudent = sc.nextBoolean();

        //Group 1
        if (name.isEmpty()) {
            System.out.println("Enter Your Name Please !");
        }else {
            System.out.println("Hello " + name + " !");
        }

        //Group 2
        if (age >= 65) {
            System.out.println("Are you that old !");
        } else if(age >= 18){
            System.out.println(" Old enough !");
        }else if( age < 0 ){
            System.out.println("age Man age ! it should be Positive !");
        }else {
            System.out.println("such a baby !");
        }

        //Group 3
        if (isStudent) {
            System.out.println("you still study !");
        }
        else {
            System.out.println("Congrats no longer a student !");
        }
        sc.close();
    }
}
