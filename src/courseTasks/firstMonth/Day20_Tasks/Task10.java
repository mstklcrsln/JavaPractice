package courseTasks.firstMonth.Day20_Tasks;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        int [] numbers= {1,0, 3,0,5,6,0,8,7, 0,0,3,2,1, 0};
        int [] exceptZero = new int[numbers.length];
        int  j =0;

        for (int i =0; i <numbers.length ; i++) {
            if(numbers[i] !=0) {
                exceptZero[j++]=numbers [i];
         }
        }
        System.out.println(Arrays.toString(exceptZero));
    }
}

/*
6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */
