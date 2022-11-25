package replitTasks.StringManipulations;

import java.util.Scanner;

public class HalfTwice {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE

        int half= word.length()/2;

        String halfWord= word.substring(0,half);
        System.out.println(halfWord+halfWord);

    }
}
/*
### Use `String methods` to print the first half of the given `word`, twice.
 Find the beginning half of the String and concatenation it twice.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation
```
Ex:
  Input:
    java
  Output:
    jaja
```
```
Ex:
  Input:
    unity

  Output:
    unun
```
 */