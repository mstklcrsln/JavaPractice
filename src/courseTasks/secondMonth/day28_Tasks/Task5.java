package courseTasks.firstMonth.secondMonth.day28_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,98,7,444,55,66));

        int max=0;
        for (Integer each : list) {
            if (each>max){
              max= each;
            }
        }
        System.out.println("max = " + max); //max = 444
    }
}

/*
5. Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
 */