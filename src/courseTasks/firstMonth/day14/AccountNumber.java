package courseTasks.firstMonth.day14;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter a account number");
        String word = scan.next();
        scan.close();

        int numberLength = word.length();
        boolean valid= word.substring(0,1).equals("2") && numberLength==7
        || word.substring(0,1).equals("5") && numberLength==10;

       if (valid) {
           System.out.println("Valid number");
       } else {
           System.out.println("Invalid account number");
       }
    }
}
