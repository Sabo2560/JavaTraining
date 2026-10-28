import java.util.ArrayList;

public class ArraysListJavaPractice {
    static void main(String[] args) {
        //Array list initialisation:
        // ArrayList Accepts data type : reference wrapper class => <Integer> ; <Double> ; <Float> ; <Boolean> ;
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1); //index = 0
        numbers.add(2); //index = 1
        numbers.add(3); //index = 2
        numbers.add(4); //index = 3
        numbers.add(5); //index = 4

        System.out.println(numbers.toString());
        numbers.remove(Integer.valueOf(4));
        numbers.clear();
        System.out.println(numbers.toString());

            for (int j = 1; j <= 5 ; j++) {
                numbers.add(j);
            }

        System.out.println(numbers.toString());
        System.out.println(numbers.isEmpty());
        System.out.println("Before : " + numbers.toString());

        numbers.forEach(number ->{
            numbers.set(numbers.indexOf(number),number * 2);
        });

        System.out.println("After : " + numbers.toString());

        //System.out.println(numbers.get(3));
    }
}
