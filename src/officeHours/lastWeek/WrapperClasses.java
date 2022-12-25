package officeHours.lastWeek;

public class WrapperClasses {

    public static void main(String[] args) {

        /*
        parseInt()  : parse a string and return its integer value
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

-ArrayList
.Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
        Then remove the first and last elements of the list, and then print the remaining elements to the console.

        2.Write a Java program that creates an ArrayList of 10 integers, and then removes the elements at index positions 2, 4, and 6 from
        the list. The program should then print the resulting list to the console.

        3.Write a java program that create an arraylist has random numbers, then check those number, if they are even,
         add again to the arraylist

         4.Write a Java program that creates an ArrayList of 10 random integers between 1 and 100,
        and then sorts the list in ascending order.

        5. Write a Java program that creates an ArrayList of strings and adds five strings to the list. The program
        should then reverse the order of the elements in the list and print the resulting list to the console.

        6. Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list.
        The program should then find the smallest and largest elements in the list and print them to the console.
 */