package courseTasks.firstMonth.day14;

import java.util.Scanner;

public class EMail2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your e-mail adress");
        String email=  scan.nextLine();
        scan.close();

        String firstword= email.substring(0,email.indexOf("_"));
       // System.out.println("firstword = " + firstword);
        String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
       // System.out.println("second = " + lastName);
        String lastPart = email.substring(email.indexOf("@"));
        //System.out.println("lastPart = " + lastPart);

        if (email.contains("_")){
            System.out.println(lastName+ "_"+ firstword+lastPart);
        } else {
            System.out.println(email);
        }
    }
}
