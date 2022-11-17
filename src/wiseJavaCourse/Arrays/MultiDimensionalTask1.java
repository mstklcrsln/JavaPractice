package wiseJavaCourse.Arrays;

import java.util.Arrays;

public class MultiDimensionalTask1 {
    public static void main(String[] args) {

        // collect the elements which have same indexes and assign the addition to a new array
        //{{3,4,5}, {2,3,6,7}} ==> {5,7,11}

        int [][] arr ={{3,4,5}, {2,3,6,7}};
        //this solution is for ==> we have 2 inner arrray, but length can e different

      int sameIndexPiece=   arr[0].length < arr[1].length ? arr[0].length  : arr[1].length; // we get the shortest index

        System.out.println(sameIndexPiece);// 3

        int [] sameIndexAddition = new int[sameIndexPiece]; // this is empty array

        for (int i = 0; i < sameIndexAddition.length; i++) {
            sameIndexAddition[i]  = arr [0][i]+ arr[1][i]; // we put the same indexes elements addition into the new array
        }
        System.out.println(Arrays.toString(sameIndexAddition)); //[5, 7, 11]
    }
}
