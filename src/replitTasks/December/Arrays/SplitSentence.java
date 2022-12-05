package replitTasks.December.Arrays;

import java.util.Scanner;

public class SplitSentence {

    public static void main(String[] args) {
        //DO NOT TOUCH BELOW:
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:
        String[] words= sentence.split(" ");
        for (String eachWord: words){
            System.out.println(eachWord);
        }
    }
}

/*
### Given a `String` `sentence` use the split() method to divide each word from the sentence and print them in separate lines
Hint: Think about what comes between each word in the sentence
Main topics: arrays, String
Example:
```
Input:
  Java is fun
Output:
  Java
  is
  fun
```
 */
