package officeHours.lastWeek;

import java.util.Scanner;

public class WrapperTasks {
    public static void main(String[] args) {

         /*
        1. write a java program, let user enter a number as string, if the number is below zero, return false,
    else return true*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String number= scan.nextLine();

        boolean isPositive= false;

        int num= Integer.parseInt(number);
        if (num>0){
            isPositive= true;
        }
        System.out.println(isPositive);

         /*
     2. write a java program, find sum of the numbers in a string, only if the number is divisible by 3
         */

        String str= "456numbershere6897";
        int sum = 0;

        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                if (Integer.valueOf(str.charAt(i))%3==0){
                    sum += Integer.valueOf(""+ str.charAt(i));
                }
            }
        }  System.out.print(sum);   //  6+6+9       ==>21

    }

}
