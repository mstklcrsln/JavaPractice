package scannerStudies;

import java.util.Scanner;

public class GradeReport {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your degree");

        int degree = scan.nextInt();
        scan.close();
        String grade = "A";


        if (degree >= 0 && degree <= 100) {

         if (degree >= 0 && degree <= 50) {
            grade = "F";
        } else if (degree <= 60) {
            grade = "D";
        } else if (degree <= 70) {
            grade = "C";
        } else if (degree <= 80) {
            grade = "B";
        } else {
            grade = "A";
        }   } else {
            grade= "invalid";}


        System.out.println("Your degree is:" + grade);

            }}