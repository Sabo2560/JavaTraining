import java.util.Arrays;

public class ArraysTrainingJava {
    static void main(String[] args) {
        // a e i o u
//        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
//
//        for (int i = 0; i < vowels.length; i++) {
//            Arrays.sort(vowels);
//            char key = vowels[i];
//            int indexOfChar = Arrays.binarySearch(vowels, key);
//
//            System.out.println("The vowel is : " + vowels[i] + ", it's Index is : " + indexOfChar);
//
//        }
//
//        int[] numbers = {1,2,3,4,5};
//        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
//
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(Arrays.equals(numbers, copyOfNumbers));
//        System.out.println(Arrays.toString(copyOfNumbers));
        //Multiplication Table Arrays
//        for (int number  = 1; number  <= 10; number ++) {
//            System.out.println("---------------");
//            for (int multiplication  = 1; multiplication  <= 10 ; multiplication ++) {
//                System.out.println("################");
//                System.out.printf("%d X %d = %d \n",number,multiplication,number * multiplication);
//            }
//        }
        int[] numbers = {1,2,3,4,5};

        for (int number :numbers) {
            System.out.println(number);
        }
    }
}
