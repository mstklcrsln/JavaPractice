package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;

public class PositiveDivide {
    public static void main(String[] args) {

        /*
      create  method that get a number from user and find the positive divisor numbers
        and return a list
         */
        int input= 25568;
        System.out.println(makeDivisorList(input)); //[1, 2, 4, 8, 16, 17, 32, 34, 47, 68, 94, 136, 188, 272, 376, 544, 752, 799, 1504, 1598, 3196, 6392, 12784, 25568]
    }
    public static List <Integer> makeDivisorList (int input){
          List <Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <=input; i++) {
            if (input%i==0){
               divisorList.add(i);
            }
        }
        return divisorList;
}
}