package courseTasks.firstMonth.secondMonth.day28_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(0,1,2,3,4,5, 6,7,8));
        System.out.println("list = " + list); //list = [0, 1, 2, 3, 4, 5, 6, 7, 8]

        int temp= list.get(list.size()-1); // get the last element to the temporary int

        list.set(list.size()-1,list.get(0)); // we change the last index with the index 0
        list.set(0,temp);                      // we assign our temp to the index 0
        System.out.println("list = " + list); //list = [8, 1, 2, 3, 4, 5, 6, 7, 0]
    }
}
/*
2. write a program that can swap the first and last elements of an integer arraylist
	            ex:
	                list = [1,2,3,4,5];
	                output: [5,2,3,4,1];
 */