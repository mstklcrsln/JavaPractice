package courseTasks.firstMonth.day14;

import java.util.Scanner;

public class FirstWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word");
        String word1= scan.next();

        System.out.println("Enter one more word");
        String word2= scan.next();


        word1 = word1.substring(1);
        word2 = word2.substring(1);
        System.out.println(word1+ word2);






    }
}
