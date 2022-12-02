package courseTasks.firstMonth.Day20_Tasks;

import java.util.Arrays;

public class Task2_Numbers {
    public static void main(String[] args) {

        int [] num = new int[100];

        for (int i = num.length-1; i >=1 ; i--) {
            num [i]= num.length-i;
        }
      System.out.println(Arrays.toString(num));

    }
}
/*
int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));

        System.out.println("--------------------------");

         int[] num1= new int[100];
        for (int i= num.length-1; i>= 0; i--) {
            num[i] = num.length-i;
        }
        System.out.println(Arrays.toString(num));

        }
 */