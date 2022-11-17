package wiseJavaCourse.Arrays;

public class Array3 {
    public static void main(String[] args) {

        // add positive numbers from array

        int [] arr = {3,-3,5,-7,-6,1,2,8};
       /* int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                sum+= arr[i];
            }
        }
        System.out.println(sum); //19 */

        System.out.println(addPositive(arr)); //19
    }
    // create a method
    public static int addPositive (int [] arr){
        int sum= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                sum+= arr[i];
            }
        }
        return sum;
    }
}
