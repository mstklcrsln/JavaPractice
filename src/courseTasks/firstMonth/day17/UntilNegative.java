package courseTasks.firstMonth.day17;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        int sumOf= 0;

        while (true) {
            System.out.println("Enter a positive number");
            int num= scan.nextInt();
            if (num<0) {
            break;
            } sumOf+=num;
        }
        System.out.println(sumOf);
}}
/*
2. Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
package Day17Tasks;

import java.util.Scanner;

public class SumOfTheNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Enter your number");
            int num = scan.nextInt();
            if (num < 0) {
                break;
            }
            sum += num;
        }
        System.out.println(sum);
    }
}
            hint: you need an infinite loop
 */