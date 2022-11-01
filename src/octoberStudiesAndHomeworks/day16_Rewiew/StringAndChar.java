package octoberStudiesAndHomeworks.day16_Rewiew;

import java.util.Scanner;

public class StringAndChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( "Please enter a string");
        String str = scan.nextLine();

        System.out.println("Please enter a letter");
        char ch= scan.next().charAt(0);

        int frequency= 0;

        for (int i = 0; i < str.length(); i++) {

            if (ch== str.charAt(i)) {
                frequency++;
            }
        }
        System.out.print(frequency);




    }
}
