package officeHours;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        int nums[] ;
        int [] number;
        String [] names;
        String lastNames;
        boolean [] isSunny = new boolean[7];
        boolean [] isSunnyAnkara= {true, true, false, true,false,false,false};

        System.out.println(Arrays.toString(isSunny)); //default value [false, false, false, false, false, false, false]

        System.out.println("-----------------");
        // write an array with input 10 numbers. Find sum of odd numbers. Find sum of even numbers

        int [] numbers = {9,8,7,44,88,99,66,33,22,11};

        int totalEven=0;
        int totalOdd= 0;
        for (int each : numbers) {
            if (each%2==0){
                totalEven +=each;
        } else {
                totalOdd += each;
            }
    }
        System.out.println(totalEven); //228
        System.out.println(totalOdd); //159
}}
