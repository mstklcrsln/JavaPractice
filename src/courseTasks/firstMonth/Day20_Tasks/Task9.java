package courseTasks.firstMonth.Day20_Tasks;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5,6,9,8,7,5,3,2,1};
        int [] reversed = new int [numbers.length];

        for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed [i]= numbers[i];
        }
        System.out.println(Arrays.toString(reversed));
    }
}

/*5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
            for (int i = numbers.length - 1, j=0; i >= 0; i--, j++) {
            reversed [j] =numbers [i];
            */