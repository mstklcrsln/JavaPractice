package octoberStudiesAndHomeworks.Day20_Tasks;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];
        for (int i = 0; i < names.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            } else if (scores[i] >= 80) {
                grades[i] = 'B';
            } else if (scores[i] >= 70) {
                grades[i] = 'C';
            } else if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }
            System.out.println(names[i] + "'s" + " score is " + scores[i] + "," + " and grade is " + grades[i]);

        }
    }}

        /*String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
            if (scores[i] >= 90) {
                grades[i] = 'A';
            }
            if (scores[i] >= 80) {
                grades[i] = 'B';
            }
            if (scores[i] >= 70) {
                grades[i] = 'C';
            }
            if (scores[i] >= 60) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

        System.out.println(names[i] + " 's score is " + scores[i] + " and grade is " + grades[i] + ".");


*/




/*
4. given the following arrays:
		            1. write a program that can store the grades of the students in the array named grades
         2. print the grade report of each students in separate lines
         		Ex:
         			Anna's score is 90, and grade is A
 */