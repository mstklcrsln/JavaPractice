package bulutluoz.Arrays;

public class AdditionOfMultiDimensionalArray {
    public static void main(String[] args) {
    
        int [][] arr = {{1,2}, {3,4,5}, {7}};
        // we want to addition all elements
        int addition=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
              addition+=  arr [i][j];
            }
        }
        System.out.println(addition); //22
    }
}
