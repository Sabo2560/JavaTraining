import java.util.Arrays;
import java.util.Scanner;

public class CompoundJavaCalculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.println("CompoundJavaCalculator.main");
        System.out.print("Enter the Principal amount : ");
        principal = sc.nextDouble();

        System.out.print("Enter the interest rate (in%):  ");
        rate = sc.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = sc.nextInt();

        System.out.print("Enter the # of years: ");
        years = sc.nextInt();
        sc.nextLine();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is %,.2f Dhs", years, amount);

        sc.close();
    }
}
