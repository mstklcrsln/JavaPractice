package replitTasks.December.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ShortestWord {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

       // String [] words= {"olive, fish, pursuit, old, warning, python, java, coffee, cat, ray"};
        String words [] = str.split(", ");

        // at first we find the shortest word
        // then find the all words same length

        String shortestWord= words [0];
        for (String currentWord: words){  // we find the shortest word
            if (currentWord.length()<shortestWord.length()) {
                shortestWord= currentWord;
            }
        }

        int countOfShortest=0;

        for (String currentWord: words){  //we compare the shortest with the other and get the same length words
            if (currentWord.length()==shortestWord.length()){
               // System.out.println(currentWord); //old, cat, ray
                countOfShortest++;  // we count the shortest words
            }
        }
        // System.out.println(countOfShortest);  3==> we have 3 words which are shortest

        // we create an array which has 3 index, to put out shortest words into it

        String [] shortestWordArray = new String[countOfShortest];  //we create a new array
        int x=0;
        for (String currentWord: words){
            if (currentWord.length()==shortestWord.length()){
                shortestWordArray [x] = currentWord; // we put the elements into the new array
                x++;
            }
        }
       // Arrays.sort(shortestWordArray);
        System.out.println(Arrays.toString(shortestWordArray));
        }
}

/*
### Given a `String` `str`, find and print the shortest words.
The `String` will have multiple words separated by commas and spaces.
If there is words that have the same length, they should all be displayed at the end.
Print all the shortest words in the following format:
> Input: word1, word2, word3, word4, etc...
> Output: [short1, short2, short3, etc...]
Hint: Think about what comes between each word in the sentence
Main topics: arrays, String, loops, if statements, primitive datatypes, operators
Example:
```
Input:
  olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
Output:
  [old, cat, ray]
```
 */