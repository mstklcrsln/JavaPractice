package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        //get a number from user and write the smaller fibonacci numbers from that number
        // fibonacci numbers 0 1 1 2 3 5 13 21 34 55 89 144 ....

        //when we enter 999 ==> result is [0, 1, 1, 2, 5, 12, 29, 70, 169, 408, 985]

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a positive number");
        int enteredNumber = scan.nextInt();

        if (enteredNumber<0){
            System.out.println("enter a number bigger than 0");
        } else if (enteredNumber==0){
            System.out.println("There is no fibonacci number smaller than 0");
        }else if (enteredNumber==1){
            System.out.println("There is only one fibonacci number smaller than 1 and it is 0");
        }else {
            writeFibonacciNumber (enteredNumber); // we create a method and call method here
        }

    }
    public static void writeFibonacciNumber(int enteredNumber) {
        // entered number is bigger than 1

        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);
        fibonacciList.add(1);

        int newFibonacciNumber =0;
        int index = 3; // because we entered the first 2 index (0,1,1) above

        while (newFibonacciNumber<enteredNumber){
            newFibonacciNumber += fibonacciList.get(index-2)+ fibonacciList.get(index-1);
            if (newFibonacciNumber<enteredNumber){
                fibonacciList.add(newFibonacciNumber);
            }
            index++;
        }
        System.out.println(fibonacciList);
    }
}
