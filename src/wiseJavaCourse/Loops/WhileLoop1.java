package wiseJavaCourse.Loops;

import java.util.Scanner;

public class WhileLoop1 {
    public static void main(String[] args) {

        // kullanıcıdan numara girmesini istedik 0 girince toplam bitecek.

        Scanner scan = new Scanner(System.in);
       // System.out.println("Please enter a number" + "\n press 0 for finish" );

        int enteredNum= 1; // we dont give 0 because 0 will stop the loop
        int count =0;
        int sum=0;

        while (enteredNum!=0) {
            System.out.println("Please enter a number" + "\n press 0 for finish" );
            enteredNum= scan.nextInt();

                if (enteredNum!= 0){
                    count++;
                    sum +=enteredNum;

                }
        }
        System.out.println("entered "+ count + " addition is " + sum);
    }
}
