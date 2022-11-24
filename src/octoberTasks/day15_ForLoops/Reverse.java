package octoberTasks.day15_ForLoops;

public class Reverse {
    public static void main(String[] args) {
        String word = "Wooden Spoon";
        String reverseWord= "";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverseWord+= word.charAt(i);
        }
        System.out.println("reverseWord = " + reverseWord);
    }
}
/*
for (int i = str.length()-1;  i >=0 ; i-- ) {
           result += str.charAt(i); }  // we are doing concenetation here adding ecah charaacter to result from 11 to 0
        System.out.println(result);
 */