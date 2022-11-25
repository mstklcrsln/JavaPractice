package replitTasks.StringManipulations;

import java.util.Scanner;

public class ReverseIt {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE BELOW
        word= word.trim();
        if (word.length()>5){
            System.out.println("Too long!");
        }
        if (word.length()<5){
            System.out.println("Too short!");
        }
        if (word.length()==5){
            System.out.println(""+ word.charAt(word.length()-1)+ word.charAt(word.length()-2)+word.charAt(word.length()-3)+word.charAt(word.length()-4)+ word.charAt(word.length()-5));
        }


    }
}
/*
### Use `String methods` and `if statements` to reverse a String that is five characters long.
If the given `word` is not five characters long, it will not be reversed. Use the following to output a value:

> - If the `word` is less than 5 characters: print `Too short!`
> - If the `word` is more than 5 characters: print `Too long!`
> - If the `word` is 5 characters: print the `reversed version` of the String. Reading characters from the end to the beginning.


Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation, if statements

```
Ex:
  Input:
    cat

  Output:
    Too short!
```

```
Ex:
  Input:
    singularity

  Output:
    Too long!
```
```
Ex:
  Input:
    apple

  Output:
    elppa
```
 */