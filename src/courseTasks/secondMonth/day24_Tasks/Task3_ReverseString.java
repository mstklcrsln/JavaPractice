package courseTasks.firstMonth.secondMonth.day24_Tasks;

public class Task3_ReverseString {
    public static void main(String[] args) {

        String word = "Mesut";
        String reversed = reverseString(word);
        System.out.println(reversed);
    }
    public static String reverseString (String word){
        String reversed = "";
        for (int i = word.length()-1; i>=0 ; i--) {
          reversed += word.charAt(i);
        }
        return reversed;
    }
}
/*
3. create a method named reverse that passes one string parameter, the method can return the reversed string
			Ex:
					str = "Java";
				reverse(str) ==> avaJ
 */