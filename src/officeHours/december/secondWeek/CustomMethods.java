package officeHours.december.secondWeek;

public class CustomMethods {
    public static void main(String[] args) {

        // write a method that count all the space in the given string, and print the number of space
        String word = "This is java office hour    ";
        countSpace(word); //count = 8

    }

    public static void countSpace(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("count = " + count);
    }

}
