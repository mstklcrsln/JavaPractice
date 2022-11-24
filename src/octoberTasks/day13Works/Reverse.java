package octoberTasks.day13Works;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter a 5 letter word");
        String word = scan.next();
        scan.close();

        if (word.length()<5) {
            System.out.println("Too short!");
        } if (word.length()>5){
            System.out.println("Too long!");
        } if (word.length()==5) {
            System.out.println("" +word.charAt(4)+ word.charAt(3)+ word.charAt(2)+ word.charAt(1) + word.charAt(0));
        }
    }
}
