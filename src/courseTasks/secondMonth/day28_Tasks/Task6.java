package courseTasks.firstMonth.secondMonth.day28_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,2,3,4,5,6,98,7,444,55,66));

       int min= list.get(0);
        for (Integer integer : list) {
            if (integer<min){
                min=integer;
            }
        }
        System.out.println("min = " + min); //min = 2
    }
}
/*
6. Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */