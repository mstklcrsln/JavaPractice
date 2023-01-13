package replitTasks.year_2023;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str= scan.next();
        int charCount = str.length();
        int counter=0;

        for (int i = 0; i <= charCount-2 ; i++) {
            if(str.substring(i, i+2).equals("hi")){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
