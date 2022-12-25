package officeHours.lastWeek;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayLists {
    public static void main(String[] args) {

      /*
       1.Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
        Then remove the first and last elements of the list, and then print the remaining elements to the console.
       */

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("melon");
        fruits.add("carrot");

        System.out.println(fruits); //[apple, banana, orange, melon, carrot]

        fruits.addAll(Arrays.asList("pear", "nuts", "strawberry"));
        System.out.println(fruits); //[apple, banana, orange, melon, carrot, pear, nuts, strawberry]

        fruits.remove(0);
        fruits.remove(fruits.size() - 1);
        System.out.println(fruits);  //[banana, orange, melon, carrot, pear, nuts]

        System.out.println("----------------------------");
        /*
          2.Write a Java program that creates an ArrayList of 10 integers, and then removes the elements at index positions 2, 4, and 6 from
        the list. The program should then print the resulting list to the console.
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1, 2, 3, 5, 6, 9, 8, 7, 4, 55, 66, 22, 11));
        System.out.println(numbers); //[1, 2, 3, 5, 6, 9, 8, 7, 4, 55, 66, 22, 11]

        numbers.remove(2);
        System.out.println(numbers); // [1, 2, 5, 6, 9, 8, 7, 4, 55, 66, 22, 11]
        numbers.remove(4);
        System.out.println(numbers);//[1, 2, 5, 6, 8, 7, 4, 55, 66, 22, 11]
        numbers.remove(6);
        System.out.println(numbers); //[1, 2, 5, 6, 8, 7, 55, 66, 22, 11]
        System.out.println("----------------------------");
        /*
          3.Write a java program that create an arraylist has random numbers, then check those number, if they are even,
         add again to the arraylist
         */

        ArrayList<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
            randomNumbers.add(random.nextInt(55));
        }
        System.out.println(randomNumbers); //[37, 11, 18, 23, 40, 33, 40, 11, 35, 25]

       /* for (int i = 0; i <randomNumbers.size() ; i++) {
            if (randomNumbers.get(i)%2==0){
                randomNumbers.add(randomNumbers.get(i) );
            }
        }
        this gives outOfMemory exception*/
        for (int num: randomNumbers){
            if (num%2==0){
                randomNumbers.add(num);
            }
        }

        System.out.println(randomNumbers); //.ConcurrentModificationException
    }
}
/*
-ArrayList
        1.Write a Java program that creates an ArrayList of strings and then adds five strings to the list.
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