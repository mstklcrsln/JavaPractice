package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers); //[3, 4]

        System.out.println("--------------");
        // add all vowel (sesli harf) to the Arraylist

        List<String> vowels= new ArrayList<>();
        // we write all elements in an array and than
        // put them into a Arraylist by using for loop

        String [] arr = {"ı","o","u","i","e","a"};

        for (int i = 0; i < arr.length; i++) {
            vowels.add(arr[i]);
        }
        System.out.println(vowels); //[ı, o, u, i, e, a]
    }
}
