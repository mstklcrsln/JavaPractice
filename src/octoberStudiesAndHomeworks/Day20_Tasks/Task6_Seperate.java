package octoberStudiesAndHomeworks.Day20_Tasks;

import java.util.Scanner;

public class Task6_Seperate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String [] items = new String[5];
        double [] prices = new double[5];
        double sum= 0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter the " + (i+1)+ ". item");
            items [i]= scan.next();
            System.out.println("How much money is " + items [i]);
            sum += prices [i];
                    }
        for (int i = 0; i <5 ; i++) {
            System.out.println(items[i]+ "\t\t\t"+ prices [i] );
        }
        System.out.println("sum = " + sum);
    }
}

/*
5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price

 */