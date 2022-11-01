package octoberStudiesAndHomeworks.day14;

import java.util.Scanner;

public class DigitOrLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= scan.next();
        scan.close();

        if (word.charAt(0) >48 && word.charAt(0)<=57)  {
            System.out.println("first character is digit");
        }  else if (word.charAt(0) >=97 && word.charAt(0) <=122) {
            System.out.println("first character is lowercase letter");
        } else if ((word.charAt(0) >=65&& word.charAt(0) <=90) ){
            System.out.println("first character is uppercase letter");
        } else {
            System.out.println("first character is special character");
        }
    }
}
