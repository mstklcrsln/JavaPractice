package novemberTasks.day28_Tasks;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        String [] arr1= {"A", "B", "C","A", "B", "C","A", "B", "C"};
        String [] arr2= {"D", "E", "F", "E", "F","E", "F","G"};

        ArrayList<String> newList = new ArrayList<>();

        for (String each1 : arr1) {
            newList.add(each1);
        }
        for (String each2 : arr2) {
            newList.add(each2);
        }
        System.out.println(newList); //[A, B, C, A, B, C, A, B, C, D, E, F, E, F, E, F, G]
    }
}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {}
 */
