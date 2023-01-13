package replitTasks.year_2023;

import java.util.Scanner;

public class RepeatSeperator {

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word= scan.next();
        String seperator= scan.next();
        int count= scan.nextInt();

        String result= "";

        // word, X, 3
        //word+X word+X word

        for (int i = 1; i <= count-1; i++) {
            result += word+seperator;
        }
        result += word;

        System.out.println(result); // 9 times ==> FirstSeperatorFirstSeperatorFirstSeperatorFirstSeperatorFirstSeperatorFirstSeperatorFirstSeperatorFirstSeperatorFirst

    }
}
