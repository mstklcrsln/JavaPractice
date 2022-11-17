package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;

public class PositiveDivide {
    public static void main(String[] args) {

        /*
      create  method that get a number from user and find the positive divisor numbers
        and return a list
         */
        int input= 28;
        System.out.println(makeDivisorList(input)); //[1, 2, 4, 7, 14, 28]
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