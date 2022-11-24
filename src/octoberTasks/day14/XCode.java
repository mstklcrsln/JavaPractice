package octoberTasks.day14;

import java.util.Scanner;

public class XCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        scan.close();

        if (word.substring(0, 1).equals("x")) {
            System.out.println(word.substring(1));
        } else {
            System.out.println(word);
        }
    }
}
/*
3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */