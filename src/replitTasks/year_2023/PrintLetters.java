package replitTasks.year_2023;

import java.util.Scanner;

public class PrintLetters {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char startingPoint= scan.next().charAt(0);
        char endPoint= scan.next().charAt(0);

        // write a program which writes the chars from starting to ending letter

        for (char i= startingPoint; i<= endPoint; i ++) {
            System.out.print(i); // a==> o abcdefghijklmno
        }



    }


}
