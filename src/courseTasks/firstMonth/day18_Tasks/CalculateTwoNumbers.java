package courseTasks.firstMonth.day18_Tasks;

import java.util.Scanner;

public class CalculateTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int result = 0;
        while (true) {
            System.out.println("Enter a number");
            int num1 = scan.nextInt();

            System.out.println("Enter a math operator");
            char op = scan.next().charAt(0);
            while (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                System.out.println("Please enter a math operator");
                op = scan.next().charAt(0);
            }
            System.out.println("Enter a number again");
            int num2 = scan.nextInt();
            if (op == '+') {
                System.out.println(num1 + num2);
            } else if (op == '-') {
                System.out.println(num1 - num2);
            } else if (op == '*') {
                System.out.println(num1 * num2);
            } else {
                System.out.println(num1 / num2);
            }

            System.out.println("Do you want to continue");
            String answer = scan.next();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("please enter valid answer");
                answer = scan.next();

            }
            if (answer.equals("no")) {
                System.out.println("Thanks for using Cydeo calculator!");
                break;
            }
        }
    }}


/*
3. Write a program that can calculate two numbers.
			1. Ask user to enter the first number
			2. Ask user to enter a math operator (+,-,/,*)
				(if user enters any invalid operator, repeat this step until user provides a valid operator)
			3. Ask user to enter the second number
			4. Display the result
			5. Ask user if they want to continue? (yes/no)
				if yes ==> repeat the entire steps
				if no ==> print "Thanks for using Cydeo calculator!"
				If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */