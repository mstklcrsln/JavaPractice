package replitTasks.December.Arrays;

import java.util.Scanner;

public class ReverseSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        // TYPE YOUR CODE BELOW:

        String reversed= "";
        String [] words= sentence.split(" ");
        for (int i = words.length-1; i >=0; i--) {
        reversed += words[i]+ " ";
        }
        reversed= reversed.trim();
        System.out.println(reversed);

        /*
        Second solution
       String [] words= sentence.split(" "); //split by space
        for (int i = words.length-1 ; i >=0 ; i--);
        System.out.println(words[i]);
         */
    }
}
/*
### Given a `String` `sentence` print a version with the words reversed.
The order of the words is changed, not the letters.
Hint: Think about what comes between each word in the sentence
Main topics: arrays, String, concatenation, index, primitive dataypes
Example:
```
Input:
  Java is fun
Output:
  fun is Java
```
Example:
```
Input:
  Hello! How are you?
Output:
  you? are How Hello!
```
 */
