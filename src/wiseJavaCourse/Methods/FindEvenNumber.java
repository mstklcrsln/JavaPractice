package wiseJavaCourse.Methods;

public class FindEvenNumber {
    public static void main(String[] args) {

        // how many even numbers in the multi dimensional array
        int [][] arr= {{2,3,5,6,4,7}, {1,2,5,6,9,87,4}, {2,5,6,9,8,7,4,33,66}};

        int pieceOfEvenNumbers =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]%2==0){
                    pieceOfEvenNumbers++;
                }
            }
            System.out.println("Piece of even numbers of arrays: "+ pieceOfEvenNumbers); //Piece of even numbers of arrays: 11
        }
    }
}
