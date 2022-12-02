package courseTasks.firstMonth.day14;

import java.util.Scanner;

public class Together {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Please enter two different words");
        String word1= scan.next();
        String word2= scan.next();
        scan.close();

        if (word1.charAt(word1.length()-1) == word2.charAt(0) ) {
            System.out.println(word1+word2.substring(1));
        } else {
            System.out.println(word1+word2);
        }
    }
}
/*
if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
            System.out.println("" + firstWord + secondWord.substring(1));
        } else {
            System.out.println("" + firstWord + secondWord);
        }
4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.

                    Input:
                        one
                        eight
                    Output:
                        oneight
 */