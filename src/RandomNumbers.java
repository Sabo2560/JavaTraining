import java.util.Random;

public class RandomNumbers {
    static void main(String[] args) {
        Random rn = new Random();

        int number1;
        int number2;
        int number3;

        double number4;

        boolean isHead;


        number1 = rn.nextInt(1,100);
        number2 = rn.nextInt(1,100);
        number3 = rn.nextInt(1,100);
        number4 = rn.nextDouble();
        isHead = rn.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);

        if (isHead) {
            System.out.println("it's a coin flip to Head");
        }else {
            System.out.println("it's a coin flip to Tail");
        }
    }
}
