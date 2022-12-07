package courseTasks.firstMonth.secondMonth.day24_Tasks;

import java.util.Arrays;

public class Task8_ReverseIntegerArray {

    public static void main(String[] args) {
       int [] arr = {10, 20, 30, 40};
        int [] reverse = reverseIntegerArray(arr);
        System.out.println(Arrays.toString(reverse));
    }
    public static int [] reverseIntegerArray (int [] arr){
        int [] reversed = new int [arr.length];
        int j=0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed [j++]+= arr[i];
        }
        return reversed;
    }
}
/*
8. Create method named reverse that passes an integer array parameter, the method can return the reversed array
				Ex:
					arr = {10, 20, 30, 40};
					reverse(arr) ==> {40, 30, 20, 10}
 */