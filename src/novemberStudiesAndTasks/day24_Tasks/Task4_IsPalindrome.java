package novemberStudiesAndTasks.day24_Tasks;

public class Task4_IsPalindrome {

    public static void main(String[] args) {
        String word = "civic";
        boolean result = isPalindrome(word);
        System.out.println(result);
    }
    public static boolean isPalindrome(String word) {
        String result = "";

        for (int i = word.length() - 1; i >= 0; i--) {
          result += word.charAt(i);
        }
            boolean palindrome = result.equalsIgnoreCase(word);
            return palindrome;
        }
    }


