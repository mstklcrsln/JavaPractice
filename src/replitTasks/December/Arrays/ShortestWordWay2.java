package replitTasks.December.Arrays;

import java.util.Scanner;

public class ShortestWordWay2 {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        //WRITE YOUR CODE BELOW

        // String [] words= {"olive, fish, pursuit, old, warning, python, java, coffee, cat, ray"};
        String words[] = str.split(", ");

        // at first we find the shortest word
        // then find the all words same length

        String shortestWord = words[0];
        for (String currentWord : words) {  // we find the shortest word
            if (currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;
            }
        }
        String allShortest= "";
        for (String currentWord : words) {  // we find the shortest word
            if (currentWord.length() == shortestWord.length()) {
                allShortest += currentWord + " | ";
            }
        }
        System.out.println(allShortest);
        String[] shortestWordArray = allShortest.substring(0,allShortest.length()-1).split(" | ");



    }}
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