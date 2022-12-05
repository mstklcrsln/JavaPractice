package replitTasks.December.Arrays;

public class Non_Dublicated {
    public static void main(String[] args) {

        int [] nums=  {1, 2, 3, 4, 3, 4, 1};

        for (int i= 0; i<nums.length; i++){
        int count =0;
        for (int each : nums) {
            if (each== nums[i]){
                count++;
            }
        }
       // System.out.println(count); //2 with only for loop
        if (count==1){
            System.out.println(nums[i] );
        }
    }
    }
}
/*
### Given an `int []` `nums` that has duplicate numbers, which means each numbers is found twice in the array.
Find and print the non-duplicate number, which mean the ones that does not have two occurrences of it.
If there is more than one, return the first unique in array!
Main topics: arrays, primitive datatypes, index, operators, loops, if statements, counter
Example:
```
Input:
  [1, 2, 3, 4, 3, 4, 1]
Output:
  2
```
```
Input:
  [6, 44, 6, 4, 3, 4, 1]
Output:
  44 (more than one unique number. but 44 is the first)
```
 */