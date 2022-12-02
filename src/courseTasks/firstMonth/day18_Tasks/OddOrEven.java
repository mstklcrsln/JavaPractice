package courseTasks.firstMonth.day18_Tasks;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        while (true) {
        System.out.println("enter a number");
         int num= scan.nextInt();

        if (num%2==0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }

        System.out.println("Would you like to enter another number");
        String answer = scan.next().toLowerCase();

        while ( ! (answer.equals("yes") || answer.equals("no"))) {
            System.out.println("Please re-enter. Would you like to enter another number");
            answer= scan.next().toLowerCase(); }

        if (answer.equals("no")){
        break;
        }
        }
            System.out.println("finished");
    }
}
/*
    }     2. Write a program that asks user to enter a numnber , and check if the number is odd or even.
        if it's odd, print "Odd Number"
        if it's even, print "Even number"

        Ask the user "Would you like to enter another number"
        if user enters yes, repeat the previous steps
        if user enters no, print nothing

        If user enteres invalid answer, repeat the previous steps*/
