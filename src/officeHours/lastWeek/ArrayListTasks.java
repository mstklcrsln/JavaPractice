package officeHours.lastWeek;

import java.util.*;

public class ArrayListTasks {
    public static void main(String[] args) {
        /*
         4.Write a Java program that creates an ArrayList of 10 random integers between 1 and 100,
        and then sorts the list in ascending order.
         */

        ArrayList<Integer> numbers= new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i <10 ; i++) {
            numbers.add(random.nextInt(100));
        }
        // System.out.println(numbers); [92, 42, 91, 50, 89, 54, 7, 23, 2, 63]

        System.out.println(numbers); //[40, 13, 35, 27, 5, 54, 80, 38, 92, 13]
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 13, 13, 27, 35, 38, 40, 54, 80, 92]

        System.out.println("----------------------");

        /*
        5. Write a Java program that creates an ArrayList of strings and adds five strings to the list. The program
        should then reverse the order of the elements in the list and print the resulting list to the console.
         */

        ArrayList<String> fiveString= new ArrayList<>();
        fiveString.add("ali");
        fiveString.add("veli");
        fiveString.add("adam");
        fiveString.add("muhtar");
        fiveString.add("kuzzat");


        System.out.println(fiveString); //[ali, veli, adam, muhtar, kuzzat]
      //  fiveString.remove(2);

        Collections.reverse(fiveString);

        System.out.println(fiveString); //[kuzzat, muhtar, adam, veli, ali]

        System.out.println("----------------------");

        /*
         6. Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list.
        The program should then find the smallest and largest elements in the list and print them to the console.
         */

        ArrayList <Integer> num = new ArrayList<>();
        num.addAll(Arrays.asList(2,5,6,3,6,9,4,1,5,8,5,11));
        System.out.println(num); //[2, 5, 6, 3, 6, 9, 4, 1, 5, 8, 5, 11]

        System.out.println(Collections.max(num)); //11
        System.out.println(Collections.min(num)); //1

    }
}

/*
        4.Write a Java program that creates an ArrayList of 10 random integers between 1 and 100,
        and then sorts the list in ascending order.

        5. Write a Java program that creates an ArrayList of strings and adds five strings to the list. The program
        should then reverse the order of the elements in the list and print the resulting list to the console.

        6. Write a Java program that creates an ArrayList of integers and adds 10 random integers to the list.
        The program should then find the smallest and largest elements in the list and print them to the console.
 */