package octoberStudiesAndHomeworks.day19_Tasks;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
    while (true){
    System.out.println("Enter your grade");
    int grade = scan.nextInt();

        if (grade < 0 || grade > 100) {
            System.err.println("Invalid entry:");
            System.exit(0);
        }

    if (grade >= 90) {
        System.out.println("A");
        break;
    }
   else if (grade >= 80) {
        System.out.println("B");
        break;
    }
    else  if (grade >= 70) {
        System.out.println("C");
        break;
    }
   else  if (grade >= 60) {
        System.out.println("D");
        break;
    } else {
        System.out.println("F");
        break;
    }
    }
    }
    }



/*
4. Write a program for grade calculator:
			1. Ask the user "Enter your grade"
				If user enters invalid grade, terminate the program after displaying the error message "Invalid Entry"

			 2. Display the grade of the student.
			 		90 ~ 100 ==> A
			 		80 ~ 89 ==> B
			 		70 ~ 79 ==> C
			 		60 ~ 69 ==> D
			 		0 ~ 59 ==> F
 */