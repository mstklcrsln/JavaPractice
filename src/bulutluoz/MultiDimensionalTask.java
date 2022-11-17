package bulutluoz;

public class MultiDimensionalTask {
    public static void main(String[] args) {

        // cretae a method that can multiple all numbers from multi dimens array

        int [][] arr= {{5,7},{5,8,9},{2,7,6}};

        System.out.println(multipleElementsOfArray(arr)); //1058400
    }
    public static int multipleElementsOfArray (int [][] arr) {
        int multiple = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                multiple *= arr [i][j];
            }
        }
      return multiple;
    }
}
