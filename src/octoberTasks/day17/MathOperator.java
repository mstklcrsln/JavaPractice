package octoberTasks.day17;
import java.util.Scanner;
public class MathOperator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("enter a number");
        double num1= scan.nextDouble();

        System.out.println("Enter one more number");
        double num2= scan.nextDouble();

        System.out.println("Enter a math operator");
        char operator= scan.next().charAt(0);

        double result= 0;

        while ( !(operator== '+' || operator== '-' || operator== '/' || operator== '*' ) ){
            System.err.println("Valid input, please enter a math operator");
            operator= scan.next().charAt(0);
        } if (operator=='+') {
            result= num1+num2;
        } else if (operator=='-') {
            result = num1-num2;
        } else if (operator=='*') {
            result= num1*num2;
        } else {
            result=num1/num2;
        }
        System.out.println(result);
    }
}
/*
  3. write a program to ask user to enter two number and math operator, and return the result.

		if the operator is invalid operator, ask user to re-enter the operator until user provides a valid operator (+, -, *, /)
 */
