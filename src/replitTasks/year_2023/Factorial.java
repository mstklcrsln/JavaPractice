package replitTasks.year_2023;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //DO NOT TOUCH THESE LINES
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE:

        scan.close();
        int factorial= 1;
        for (int i = 1; i <=n ; i++) {
            factorial= i*factorial;
        }
        System.out.println(factorial);
    }
    }

