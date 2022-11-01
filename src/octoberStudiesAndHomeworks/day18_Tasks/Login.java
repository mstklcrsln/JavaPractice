package octoberStudiesAndHomeworks.day18_Tasks;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your username");
        String username= scan.nextLine();

        System.out.println("Enter your password please");
        String password = scan.nextLine();
        int attempt= 0;

        if (username.equals("Cydeo") && password.equals("WoodenSpoon")){
            System.out.println("Logged in");
        } else {
            System.out.println("Wrong inputi please try again");
            int attemp= 3;
        }

            while ( ! ((username.equals("Cydeo") && password.equals("WoodenSpoon"))))  {

                System.err.println("Please enter  username again");
                username= scan.nextLine();

                System.err.println("Please enter pasword  again");
                password= scan.nextLine();
                 attempt --;

            }
            if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                System.out.println("Logged in");
            } else {
                System.err.println("Your account is locked.");
            }
        scan.close();
    }
}

/*
2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three
                        attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."
 */