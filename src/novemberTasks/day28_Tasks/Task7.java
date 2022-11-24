package novemberTasks.day28_Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,2,3,4,4,5,6,7,7));

       int firstDubl= 0;
        for (Integer each : list) {
            int freq=0;
            for (Integer element : list){
                if (each== element){
                    freq++;
                }
            }
            if (freq>1){
                firstDubl=each;
                break;
            }
        }
        System.out.println("firstDubl = " + firstDubl); //firstDubl = 2
    }
}
/*
7. Write a program that can return the first duplicated element from an arrayList of Integer
		Ex:
			list = [1,2,2,3,4,4,5,6,7,7];
			output:
				2
 */