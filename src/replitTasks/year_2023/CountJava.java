package replitTasks.year_2023;

import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word= scan.next();

        int charCount= word.length();
       // int targetCharCount= 4; // ==> for java length is 4
        int counter= 0;

        for (int i = 0; i <= charCount-4; i++) {
            String current4= word.substring(i, i+4);
           /*  System.out.println((current4));
            ajavaz
            ajav
            java
             */
            if (current4.equals("java")){
                counter++;
            }
        }
        System.out.println(counter); //     javasavafavajavaravajavayavajajajava ==>4

    }
}
