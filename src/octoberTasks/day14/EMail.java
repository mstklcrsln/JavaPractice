package octoberTasks.day14;

import java.util.Scanner;

public class EMail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your email adress");
        String eMail= scan.nextLine();

       int startingPoint= eMail.indexOf('@');
       int secondDot =eMail.lastIndexOf('.');
        System.out.println(eMail.substring(startingPoint+1, secondDot));
    }
}
/**
 * 1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)
 *
 * 		Ex:
 * 			email = Cydeo.School@gmail.com
 *
 * 		output:
 * 			gmail
 *
 *
 * 			email = "School.Cydeo@yahoo.com
 *
 * 		output:
 * 			yahoo
 */