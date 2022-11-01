package octoberStudiesAndHomeworks.Day20_Tasks;

import java.util.Scanner;

public class Task5_AverageNumber {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("How many number you want to enter");

        int entered = scan.nextInt();
        int [] fullNumbers = new int[entered];
        int average=0;
        int sum = 0;

        for (int i = 0; i <fullNumbers.length; i++) {
            System.out.println("Enter your numbers");
            sum+= scan.nextInt();
            sum += fullNumbers [i];

         average = sum/entered;

        }
        System.out.println("Average number is "+ average);
    }
}
/*
4. AverageNumber:
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */