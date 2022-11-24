package octoberTasks.day13Works;

import java.util.Scanner;

public class day13_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Can you write a sentence");

        String sentence= input.nextLine();

       // System.out.println("sentence = " + sentence);

      char c1= sentence.charAt(0);
      char c2= sentence.charAt(sentence.length()-1);

        System.out.println("The first character of your sentence is " + c1+ " and the last character of your sentence is " + c2);
    }

    public static class InitialOfuser {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Can you give me one word");
           String word1 = scan.next();
            System.out.println("Can you give me one word again");
            String word2= scan.next();

            System.out.println(word1.charAt(0)+ "." + word2.charAt(0));
        }
    }

    public static class LogInFunction {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter your username");
            String username= scan.next();

            System.out.println("Please enter your password");
            String password= scan.next();

            if (username.equals("Cydeo")  && password.equals("WoodenSpoon")) {
                System.out.println("Logged in." );
            } else {
                System.out.println("Incorrect username or password");
            }
        }
    }

    public static class LongestString {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter one word" );
           String input = scan.next();

            System.out.println("Please enter one different word");
            String input2= scan.next();

            if (input.length()> input2.length()) {
                System.out.println("First word is longest");
            } else{
                System.out.println("Second word is longest");
            }
        }
    }

    public static class ThreeLetterWord {
        public static void main(String[] args) {

            Scanner scan= new Scanner(System.in);

            System.out.println("Please enter a 3 letter word");
            String word= scan.next();

            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");
            } else {
                System.out.println("Okay word");
            } if (word.length()<=3) {
                System.out.println("Word is too short");
            } else {
                System.out.println("Word is too long");
            }
        }
    }

    public static class CheckWords {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter a word");
            String word1= scan.next();

            System.out.println("Please enter a word");
            String word2= scan.next();

            System.out.println("Please enter a word");
            String word3= scan.next();

                int first = word1.length();
                int second = word2.length();
                int third= word3.length();

                if (first==second&& second==third) {
                    System.out.println("All words are same length");
                } if (first==second&& second!=third || first==third && second!=first || second==third &&first!=second){
                    System.out.println("Not Same nor Different lengths");
                } if (first!=second&& second!=third&& third!=first) {
                System.out.println("All different length");
            }
        }
    }

    public static class BiggerThanThree {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter a word");
            String word= scan.next();

            if (word.length()<=0) {
                System.out.println("String is empty");
            } else if (word.length()>=3) {
                System.out.println(word.substring(word.length()-3));
            } else{
                System.out.println(word);
            }

        }
    }

    public static class AreSame {
        public static void main(String[] args) {
            String word= "theater tost";

            char c1= word.charAt(0);
            char c2= word.charAt(word.length()-1);

            if (c1==c2) {
                System.out.println("same");
            } else {
                System.out.println("not same");
            }
        }
    }
}
