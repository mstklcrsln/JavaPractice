package replitTasks.December.Arrays;

import java.util.Scanner;

public class FirstAndLastChars {

    public static void main(String[] args) {
//DO NOT TOUCH BELOW:
       Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //WRITE YOUR CODE BELOW:
      //String [] words = {"hello", "why", "by", "apple" , "note"};

        for (int i= 0; i<words.length; i++){
           // System.out.print(words[i]);
            String currentStr= words[i];
            System.out.println(currentStr.charAt(0)+ "" + currentStr.charAt(currentStr.length()-1));
        }
    }
}
/*
### Given a `String []` `words` print the first and last character of each String element in the array.
Print the first and last character in the same line with no spaces.

#### Note: The loop used in the given code is to dynamically create the String array.
You don't need to fully understand this part yet, focus only on having access to an array.

Main topics: arrays, primitive datatypes, concatenation, index, operators, loops, String

Example:
```
Input:
  ["hello", "why", "by", "apple" , "note"]

Output:
  ho
  wy
  by
  ae
  ne
```
 */