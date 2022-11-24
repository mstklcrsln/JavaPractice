package octoberTasks.Day20_Tasks;

import java.util.Arrays;

public class Task {
    public static void main(String[] args) {

      int[] num = new int[100];
        for (int i= num.length-1; i>= 0; i--) {
            num[i] = num.length-i;
        }
        System.out.println(Arrays.toString(num));

    }
    }

