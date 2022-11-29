package officeHours;

public class ReverseString {
    public static void main(String[] args) {
        
        String word = "home";
        String result= "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += ""+ word.charAt(i);
        }
        System.out.println("result = " + result); //result = emoh
    }
}
