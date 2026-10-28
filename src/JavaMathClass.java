import java.util.Scanner;

public class JavaMathClass {
    static void main(String[] args) {
        //System.out.println(Math.PI);
        //System.out.println(Math.E);

        //double result;

        /* result = Math.pow(2,8);
        result = Math.abs(-5);
        result = Math.sqrt(7);
        result = Math.round(3.98);
        result = Math.ceil(3.21);
        result = Math.floor(3.99);

        result = Math.max(1,20);
        result = Math.min(10,20);

        System.out.println(result);

         */

        // Hypotenuse c = Math.sqrt(a² + b²)

        Scanner sc = new Scanner(System.in);


        /*
        double a;
        double b;
        double c;

        System.out.print("Enter the length of side A : ");
        a = sc.nextDouble();

        System.out.print("Enter the length of side B : ");
        b = sc.nextDouble();

        c = Math.sqrt(Math.pow(a , 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse (Side c) = " + c);
         */


        // circumference
        // area
        // volume

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the Radius : ");
        radius = sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        System.out.println("The circumference is : " + circumference + "cm");
        System.out.println("The area is : " + area + "cm²");
        System.out.println("The Volume is : " + Math.round(volume) + "cm²");

        System.out.printf("The circumference is : %.1fcm\n", Math.floor(circumference));
        System.out.printf("The area is : %.1fcm²\n", Math.ceil(area));
        System.out.printf("The Volume is : %.1fcm²\n", Math.abs(volume));

        sc.close();

    }
}
