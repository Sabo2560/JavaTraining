import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingJava {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a Number : \n");
            int x = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter another number to divide by : ");
            int y = sc.nextInt();
            sc.nextLine();

            int z = x/y;
            System.out.println("result is : " + z);

        } catch (ArithmeticException e) {
            System.out.println("Why just Why not on 0 ");;
        } catch (InputMismatchException e) {
            System.out.println("Enter a Number dude a Number");
        } catch (Exception e){
            System.out.println("something is Seriously WRONG !");
        }finally {
            System.out.println("this will always print here (has other Usage)");
            sc.close();
        }
    }
}
