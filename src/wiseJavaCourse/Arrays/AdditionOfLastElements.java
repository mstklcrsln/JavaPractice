package wiseJavaCourse.Arrays;

public class AdditionOfLastElements {
    public static void main(String[] args) {

        // create a method that collect the last elements from array and writes

        int [][] arr = {{1,2}, {3,4,5}, {7,5,6,9,9,8}};

    collectLastElementsOfArray(arr); //15

    }
    public static void collectLastElementsOfArray (int [][] arr){
        int result= 0;

        for (int i = 0; i < arr.length; i++) {
        result +=     arr[i][arr[i].length-1];
        }
        System.out.println(result);
    }
}
