import java.util.Arrays;

public class JavaPrintfStatement {
    static void main(String[] args) {
        // printf() = a method used to format output
        // %[flags] [width] [.precision] [specifier-character]

        String name = "Spongbob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.8;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name);
        System.out.printf("Your name starts with %c \n", firstLetter);
        System.out.printf("you are %d years old\n", age);
        System.out.printf("You are %f tall\n", height);
        System.out.printf("Employed : %b\n",isEmployed);

        System.out.printf("%s is %d years old\n",name,age);

        double price1= 990900.99;
        double price2 = 100.14;
        double price3 = -54.03;

        System.out.printf("%.1f\n", price1);
        System.out.printf("%.2f\n", price2);
        System.out.printf("%.3f\n", price3);

        System.out.printf("%,.1f\n", price1);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%(.3f\n", price3);

        int id = 1;
        for (int i = 0; i< 3 ; i++) {
            System.out.printf("%-5d\n", id);
        }

    }
}
