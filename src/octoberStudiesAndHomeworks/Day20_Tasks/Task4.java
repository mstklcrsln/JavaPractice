package octoberStudiesAndHomeworks.Day20_Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

      int [] numbers = new int[10];

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println("Enter a number");
            numbers [i]= scan.nextInt();

        }
        int max = numbers [0];
        int min = numbers [0];

        for (int i = 0; i <numbers.length ; i++) {
            if (numbers[i]>max) {
                max=numbers[i];}
                if (numbers [i]<min) {
                    min= numbers[i];
                }
            }
        System.out.println("max: "+ max + ", min: "+ min);
    }}
/*
 int [] numbers = {10,5,4,20,1,0};
                int max = numbers[0]; // we assume that first number (in index 0) is the biggest, and next compare every single element one by one . if the new element is bigger i will change it

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] >max) { // if there is element in the array that is greater than the current max number
            max = numbers[i]; // we asiigne the greater number to max
            }
        }
        System.out.println(max);
3. Write a program that asks user to enter a number 10 times:
			1. store all user entered numbers in an array
			2. find the max number
			3. find the min number

			int[] arr = new int[10];

for(int i = 0; i < arr.length; i++){
  System.out.println("enter a number");
  arr[i] = scanner.nextInt();
}
 */