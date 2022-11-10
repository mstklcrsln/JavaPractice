package NovemberStudiesAndTasks.day22.day23_Tasks;

import java.util.Arrays;

public class Day23_MethodTasks3 {
    public static void main(String[] args) {

        regularFormat("wooDEN", "SPOoon"); //Arranged type of your input is Wooden Spooon
        isAnagram("silent", "listen"); //silent and listen are anagram words

    }

    public static void regularFormat (String name, String surname){

      String arrangedName=name.substring(0,1).toUpperCase()+
              name.substring(1).toLowerCase() +
              " " +
              surname.substring(0,1).toUpperCase() +
              surname.substring(1).toLowerCase();
        System.out.println("Arranged type of your input is "+ arrangedName);


    }

    public static void isAnagram (String word1, String word2) {
        char [] lettersOfWord1 = word1.toCharArray();
        char [] lettersOfWord2 = word2.toCharArray();

        Arrays.sort(lettersOfWord1);
        Arrays.sort(lettersOfWord2);
        if (Arrays.equals(lettersOfWord1,lettersOfWord2)){
            System.out.println( word1+ " and " + word2 + " are anagram words");
        }else  {
            System.out.println( "\'"+ word1+ "\' and \'" + word2 + "\' are NOT anagram words");
        }
    }
}
