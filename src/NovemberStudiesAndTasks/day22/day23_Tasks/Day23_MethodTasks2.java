package NovemberStudiesAndTasks.day22.day23_Tasks;

import java.util.Arrays;

public class Day23_MethodTasks2 {
    public static void main(String[] args) {

        printEachChar("Woooden spoon"); //[W, o, o, o, d, e, n,  , s, p, o, o, n]
        System.out.println();

        System.out.println();
        calculator(8,9,'*'); //The result of your choise math operator ' * ' is 72


    }

            public static void printEachChar (String word){
        char[] eachChar = word.toCharArray();
    System.out.println(Arrays.toString(eachChar));
}

            public static void calculator (int num1, int num2, char mathOperator) {
         int result=0;
            if (mathOperator=='+') {
             result=(num1+num2);
            } if (mathOperator=='-') {
                    result=(num1-num2);
                }if (mathOperator=='*') {
                    result=(num1*num2);
                }if (mathOperator=='/') {
                    result=(num1/num2);
                }
                System.out.println("The result of your choise math operator \' "+ mathOperator + " \' is " + result);
            }









}
