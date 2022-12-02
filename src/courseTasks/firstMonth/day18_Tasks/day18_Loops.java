package courseTasks.firstMonth.day18_Tasks;

import java.util.Scanner;

public class day18_Loops {
    public static class Calculator {

        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);

            System.out.println("Enter a number");
            int num1= scan.nextInt();

            System.out.println("Enter another number");
            int num2= scan.nextInt();

            int count= 0;

            while (num1>=num2) {
                num1 -=num2;
                count++;
            }
            System.out.println(count);



        }
    }
}
