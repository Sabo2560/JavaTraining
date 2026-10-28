import java.util.Scanner;

public class CalculatorPracticeJava {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double firstNumber;
        double secondNumber;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("CalculatorPracticeJava.main");
        System.out.print("Enter first Number : ");
        firstNumber = sc.nextDouble();

        System.out.println(firstNumber);

        System.out.println("Choose Operator ( * ; + ; - ; / ; % ; ^)");
        operator = sc.next().charAt(0);

        System.out.println("Enter the Second Number : ");
        secondNumber = sc.nextDouble();

        switch (operator){
            case '*' -> result = firstNumber * secondNumber;
            case '+' -> result = firstNumber + secondNumber;
            case '-' -> result = firstNumber - secondNumber;
            case '^' -> result = Math.pow(firstNumber, secondNumber);
            case '/' -> {
                if (secondNumber == 0){
                    System.out.println("Can't Divide by 0");
                    validOperator = false;
                }else{
                    result = firstNumber / secondNumber;
                }
            }
            case '%' -> result = firstNumber % 2;
            default ->  {
                System.out.println("Not a Registered Operator (Refer to these : * ; + ; - ; / ; % ; ^) ");
                validOperator = false;
            }
        }

        if (validOperator){
            System.out.printf("%.2f",result);
        }


    }
}
