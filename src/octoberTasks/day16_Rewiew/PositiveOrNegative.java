package octoberTasks.day16_Rewiew;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int positive = 0;
        int negative = 0;
        int zero =0;

        for (int i = 1; i <6 ; i++) {
            System.out.println("Enter a number");
            int num= scan.nextInt();

            if (num<0){
                negative+=1;
            } else if (num>0) {
                positive+=1;
            } else {
                zero+=1;
            }
                    }
        System.out.println(" You have put " +positive+ " postive, " + negative+ " negative numbers and " + zero +" zero's" );
    }
}
/*
1. Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
 for (int i = 1; i < 6; i++) {
            System.out.println ("Please enter your "+i+". number:");
            int number=new Scanner (System.in).nextInt ();
            if(number>0){
                positive++;
            }else if (number<0){
                negative++;
            }else {
                zero++;
            }
        } System.out.println ("We have "+positive+" positive and "+negative+" negative number");			Ex:
				Inputs:
					10
					20
					-1
					0
					3
				Output:
					3 positive and 1 negative
 */