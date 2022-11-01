package scannerStudies;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your degree");

        int degree = scan.nextInt();
        scan.close();
        String score = "A";


        if (degree >= 0 && degree <= 100) {

         if (degree >= 0 && degree <= 50) {
            score = "F";
        } else if (degree <= 60) {
            score = "D";
        } else if (degree <= 70) {
            score = "C";
        } else if (degree <= 80) {
            score = "B";
        } else {
            score = "A";
        }   } else {
            score= "invalid";}


        System.out.println("Your degree is:" + score);

            }}