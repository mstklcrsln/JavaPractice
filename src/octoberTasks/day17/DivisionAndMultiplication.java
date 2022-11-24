package octoberTasks.day17;

import java.util.Scanner;

public class DivisionAndMultiplication {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       int result= 0;

        System.out.println("Enter a number");
        int num1= scan.nextInt();

        System.out.println("Enter another number");
        int num2 = scan.nextInt();


        for (int i = num1; i >=num2 ; i= i-num2) {
            result++;
        }
        System.out.println(result);

    }
}
/*
1. Write a program that can divide two positive numbers without using / (division) and * (multiplication) operators.
  while ( !(ch=='+' || ch=='-')) {
            System.out.println("Invalid operator, please re-enter");
            ch=scan.next().charAt(0);       // if we dont put this it writes infinite times "Invalid operator, please re-enter"
            System.out.println("Enter * or / operator");
        char  op= scan.next(). charAt('0');
 */
