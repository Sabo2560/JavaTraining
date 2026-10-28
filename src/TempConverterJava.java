import java.util.Scanner;

public class TempConverterJava {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.println("TempConverterJava.main");
        System.out.println("Hello and Welcome to temperature Converter in JAVA");

        System.out.println("Enter Temp : ");
        temp = sc.nextDouble();

        System.out.print("Choose (C) Convert to Celsius : ");
        System.out.print("Choose (F) Convert to Fahrenheit : ");
        unit = sc.next().toUpperCase();

        //System.out.println(unit);
        //System.out.println(temp);

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : ((temp * 5 ) / 9) + 32;

        System.out.printf("%.2f ° %s", newTemp , unit);

        sc.close();
    }
}
