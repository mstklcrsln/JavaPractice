package courseTasks.firstMonth.secondMonth.day25_Tasks;

import java.util.Arrays;

public class Task1_MergeTwoInteger {

    public static void main(String[] args) {

    double [] arr1= {1,2,3,4,5,6};
    double [] arr2 = {11,22,33,44,55};
    double [] added = mergeTwoDouble(arr1,arr2);
        System.out.println(Arrays.toString(added)); //[1, 2, 3, 4, 5, 6, 11, 22, 33, 44, 55]

    }
    //1. create a method that can merge two integer arrays.
        public static int [] mergeTwoInteger (int [] arr1, int [] arr2){

        int [] result = new int[arr1.length+arr2.length];
            int i=0;
            for (int each : arr1) {
                result [i++]= each;
            }
            for (int each1 : arr2) {
                result[i++]= each1;
            }return result;
        }

        // 2. create a method that can merge two double arrays.
        public static double [] mergeTwoDouble (double [] arr1, double [] arr2){

            double [] result = new double[arr1.length+arr2.length];
            int i=0;
            for (double each : arr1) {
                result [i++]= each;
            }
            for (double each1 : arr2) {
                result[i++]= each1;
            }return result;
        }

          //  3. create a method that can merge two char arrays.
        public static char [] mergeTwoChar (char [] arr1, char [] arr2){

        char [] result = new char[arr1.length+arr2.length];
        int i=0;
        for (char each : arr1) {
            result [i++]= each;
        }
        for (char each1 : arr2) {
            result[i++]= each1;
        }return result;
    }
    
            //4. create a method that can merge two String arrays.
        public static String [] mergeTwoString (String [] arr1, String [] arr2){

                String [] result = new String[arr1.length+arr2.length];
                int i=0;
                for (String each : arr1) {
                    result [i++]= each;
                }
                for (String each1 : arr2) {
                    result[i++]= each1;
                }return result;
            }
}

/*
Task1:
	1. create a method that can merge two integer arrays.
	2. create a method that can merge two double arrays.
	3. create a method that can merge two char arrays.
	4. create a method that can merge two String arrays.


 */