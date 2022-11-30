package officeHours;

import java.util.Scanner;

public class PasswordCheck {

    public static void main(String[] args) {

         /*
        password checker, 3 guess
         */

        String pass = "Cydeo12";        //this is valid pass
        Scanner scan= new Scanner(System.in);
        int guessNo = 0;

        while (true){
            System.out.println("Please enter your password");
            String guess = scan.nextLine();         //this is user's entered pass

                if (guess.equals(pass)){            // if the user's entered is equal to our valid pass
                    System.out.println("Welcome to dashboard");
                    break;                      // we break the loop
                }

                guessNo++; // if the user entered invalid pass our guessNo should increase by 1 we use thin number to check how many times the user entered wrong pass

                if (guessNo==3){
                    System.out.println("Your account is deactivated");
                    break;
                }
        }
    }
}
