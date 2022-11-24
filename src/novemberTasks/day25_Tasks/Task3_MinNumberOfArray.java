package novemberTasks.day25_Tasks;

import java.util.Arrays;

public class Task3_MinNumberOfArray {

    public static void main(String[] args) {

        int [] num = {10,20,3,4,120,5,6,7,99, 100};
        int min= minNumber(num);
        System.out.println("min = " + min);

    }
        //1. create a method that can return the min number from an integer array
        public static int minNumber (int [] number){
                    Arrays.sort(number);
                    int min = number[0];
                    return min;
                }

        //	2. create a method that can return the min number from double array
        public static double minNumber (double [] number){
                    Arrays.sort(number);
                    double min = number[0];
                    return min;
                }

        //	3. create a method that can return the min number from long array
        public static long minNumber (long [] number){
                Arrays.sort(number);
                long min = number[0];
                return min;
            }

        //	4. create a method that can return the min number from short array
        public static short minNumber (short [] number){
                Arrays.sort(number);
                short min = number[0];
                return min;
            }

        //	5. create a method that can return the min number from float array
        public static float minNumber (float [] number){
                Arrays.sort(number);
                float min = number[0];
                return min;
            }

        //	6. create a method that can return the min number from byte array
        public static byte minNumber (byte [] number){
                Arrays.sort(number);
                byte min = number[0];
                return min;
            }
}
