package wiseJavaCourse.Arrays;

public class MultiDimensinalLongestString {
    public static void main(String[] args) {
        // we want to find longest string from array

        String [][] arr= {{"İlker", "Nesrin"}, {"Hasan", "Heysem", "Nurullah", "Yusuf Enes"}};

        String longestWord= arr[0][0];
        for (int i = 0; i < arr.length; i++) { // outer array
            for (int j = 0; j < arr[i].length; j++) {
                if(arr [i][j].length() > longestWord.length()){
                    longestWord= arr [i][j];
                }
            }
        }
        System.out.println(longestWord); //Yusuf Enes
    }
}
