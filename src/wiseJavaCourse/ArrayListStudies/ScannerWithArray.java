package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerWithArray {
    public static void main(String[] args) {

        // create a method that get some names from user and quit and returns when user puts Q.

        System.out.println(createList()); //[ali, veli, mesut, hasan]
    }
    public static List <String> createList (){
        List<String> words = new ArrayList<>();
        Scanner scan= new Scanner(System.in);
        String enteredWord ="";

        while (!enteredWord.equalsIgnoreCase("Q")) {
            System.out.println("Please enter a word to add the list\nPress q for finish");
            enteredWord= scan.nextLine();
            if (!enteredWord.equalsIgnoreCase("Q")){
                words.add(enteredWord);
            }
        }
        return words;
    }
}
