package courseTasks.firstMonth.Day20_Tasks;

import java.util.Arrays;

public class Task1_Numbers {
    public static void main(String[] args) {


        int[] numbers = new int[101];

        for (int i = 1; i <= 100; i++) {
           numbers [i]=i;
        }
        System.out.println(Arrays.toString(numbers));
       }

    }

/*
  for (char i = 'A', j=0; i <= 'Z' && j<letters.length; i++, j++) { //j is index number
          letters [j] =i;
        }

       System.out.println(Arrays.toString(letters)); // [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
 */