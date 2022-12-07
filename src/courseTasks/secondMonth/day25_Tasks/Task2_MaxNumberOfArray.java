package courseTasks.firstMonth.secondMonth.day25_Tasks;

import java.util.Arrays;

public class Task2_MaxNumberOfArray {
    public static void main(String[] args) {

        int [] num = {1,2,3,4,120,5,6,7,99, 100};
        int max= maxNumber(num);
        System.out.println("max = " + max);
    }
    //1. create a method that can return the max number from an integer array
    public static int maxNumber (int [] number){
        Arrays.sort(number);
    return number [number.length-1];
    }

    //2. create a method that can return the max number from double array
    public static double maxNumber (double [] number){
        Arrays.sort(number);
        return number [number.length-1];
    }

    //3. create a method that can return the max number from long array
    public static long maxNumber (long [] number){
        Arrays.sort(number);
        return number [number.length-1];
    }

    //4. create a method that can return the max number from short array
    public static short maxNumber (short [] number){
        Arrays.sort(number);
        return number [number.length-1];
    }

    //5. create a method that can return the max number from float array
    public static float maxNumber (float [] number){
        Arrays.sort(number);
        return number [number.length-1];
    }

    //6. create a method that can return the max number from byte
    public static byte maxNumber (byte [] number){
        Arrays.sort(number);
        return number [number.length-1];
    }
}
