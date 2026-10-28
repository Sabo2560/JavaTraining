import java.util.Scanner;

public class CustomExceptionJava {
    static void main(String[] args) {
        //User Defined Exceptions :
        //ex EmailDuplicate; InvalidCreditException; AgeException;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        try {
            checkAge(age);
        }
        catch(Exception e){
            System.out.println("A problem Occured : " + e);
        }

    }
    static void checkAge(int age) throws AgeException{
        if (age < 18) {
            throw new AgeException("\n" + "You must be over 18 ");
        }else {
            System.out.println("You are Signed up !");
        }
    }
}

