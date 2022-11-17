package wiseJavaCourse.Loops;

import java.util.Scanner;

public class WhileLoop3 {
    public static void main(String[] args) {

        // password
        Scanner scan = new Scanner(System.in);
        boolean passIsOkey =false;
        String pass ="";
        int flag=0;
        while (passIsOkey!=true){
            System.out.println("Enter pass word");
            pass= scan.nextLine();

            if (! (pass.charAt(0) >='a' &&  pass.charAt(0) <= 'z')) {
                System.out.println("First character must be uppercase");
                flag++;
            }
            if (! (pass.charAt(pass.length()-1) >='0' &&  pass.charAt(pass.length()-1) <='9')) {
                System.out.println("last character must be integer");
                flag++;
            }
            if (flag==0) {
                passIsOkey=true;
                System.out.println("Pass is valid");
            }
        }
    }
}
