package replitTasks.December.Arrays;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {
        int [] nums = {10, 14, -93, 140, -20};
        System.out.println(Arrays.toString(nums)); //[10, 14, -93, 140, -20]

        for (int each: nums){
            System.out.print(each+ ", "); //10, 14, -93, 140, -20,
        }

    }
}
/*
### Print the given `int []` `nums` to output all of the elements in one line.
#### Note: Think about how you must print out a whole array
Main topics: arrays, primitive data types, concatenation
Example Flow:
```
[10, 14, -93, 140, -20]
```
 */