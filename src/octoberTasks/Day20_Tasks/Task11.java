package octoberTasks.Day20_Tasks;

public class Task11 {

    public static void main(String[] args) {


        int [] num1 = {1,2,3,4,5};
        int [] num2 = {4,5,6,7,8};
        int common =0;

        for (int i = 0; i <num1.length ; i++) {
            for (int j = 0; j <num2.length ; j++) {
                if (num1[i]==num2[j]) {
                    System.out.print(num1[i]+ " ");
            }
        }
        }
    }
}

/*
7. Write a program that can print out the common elements from two integer array

          output:
              4 5
 */
