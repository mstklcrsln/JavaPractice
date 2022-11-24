package novemberTasks.day28_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        for (Integer each : scores) {
            if (each>=90&& each<=100){
                gradeOfA.add(each);
            } else if (each>=80&& each<90) {
                gradeOfB.add(each);
            }else if (each>=70&& each<80) {
                gradeOfC.add(each);
            }else if (each>=60&& each<70) {
                gradeOfD.add(each);
            }else {
                gradeOfF.add(each);
            }
        }
        System.out.println("number of grade A = " + gradeOfA.size());
        System.out.println("number of grade B = " + gradeOfB.size());
        System.out.println("number of grade C = " + gradeOfC.size());
        System.out.println("number of grade D = " + gradeOfD.size());
        System.out.println("number of grade F = " + gradeOfF.size());
        /*
        number of grade A = 2
        number of grade B = 2
        number of grade C = 3
        number of grade D = 1
        number of grade F = 4
         */
    }
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59

        Write a program that can count the total numbers of grade A, B, C, D and F
 */
