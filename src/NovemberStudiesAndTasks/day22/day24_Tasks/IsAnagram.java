package NovemberStudiesAndTasks.day22.day24_Tasks;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
    String word1= "abc";
    String word2= "cbag";
    boolean isAnagram = isAnagram(word1,word2);
        System.out.println("isAnagram = " + isAnagram);
    }
    public static boolean isAnagram (String word1, String word2) {
        char[] ch1= word1.toCharArray();
        char [] ch2= word2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean isAnagram = Arrays.equals(ch1,ch2);
        return isAnagram;
    }
}
