package replitTasks.StringManipulations;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW

        int wordLength= word.length();
        int middle= wordLength/2;
        String result= "";

        if (wordLength%2==0){
            char ch1= word.charAt(middle-1);
            char ch2= word.charAt(middle);
            result= "" + ch1+ch2;
            System.out.println(result);
        }
        if (wordLength%2 !=0){
            char ch= word.charAt(middle);
            result= ch+ "";
            System.out.println(result);
        }

    }

    }
/*
### Use `String methods` and `if statements` to find the middle character/s of the given `word` variable. The value of the `word` will be input from a Scanner, but you only need to interact with the String variable. Output in the following format:

#### Note: Odd length words will have one middle character, but even length words will have two middle character, so use the length of the Strings to determine what the output should be.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements, operators

```
Ex:
  Input:
    oak

  Output:
    a
```
```
Ex:
  Input:
    java

  Output:
    av
```
```
Ex:
  Input:
    apples

  Output:
    pl
```
 */