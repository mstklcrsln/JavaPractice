package officeHours.december22;

public class WrapperClasses {

    public static void main(String[] args) {

        /*
        parseInt()      : parse a string and return its integer value
        valueOf()       : convert a string to an Integer object
        toString        :take a int/Integer's string value (convert it to string object)
        Integer.max and min     : finds max and min of ınteger value
         */

        System.out.println(Integer.toString(123).concat(" one two three")); //123 one two three

        System.out.println("-----------------");

        /*
        String str= "123house258";
        int total =0;
        for (int i = 0; i < str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))) {
                total +=Integer.valueOf(str.charAt(i));
            }
        }
        System.out.println(total); //309 this is ascii value
        */
        String str= "123house258";
        int total =0;
        for (int i = 0; i < str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))) {
                total +=Integer.valueOf("" + str.charAt(i));
            }
        }
        System.out.println(total); //21




    }
}
/*
Practice questions for Java office hour (21.12.2022)
-Wrapper class
1. write a java program, let user enter a number as string, if the numer is below zero, return false,
    else return true

 2. write a java program, find sum of the numbers in a string, only if the number is divisible by 3


 */