package officeHours;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a num");
        int num= scan.nextInt();

        int total= 0;
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j <= num; j++) {
                for (int k = 0; k <=num ; k++) {
                    if (i+j+k ==num) {
                        System.out.println(""+ i+j+k);
                        total++;
                    }
                }
            }
        }
    }
}
/*
// input a number, use 3 number smaller or equal to that number,
    // make combination that sum of that 3 number is equal to the number you input.
    // 2 --> 6
    /*
002 ==> plus these equal to 2
011
020
101
110
200

// 3 --> 10
// 5 --> 21
 */