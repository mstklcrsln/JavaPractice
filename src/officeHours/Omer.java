package officeHours;

public class Omer {
    public static void main(String[] args) {


        String str = "amazon";

        String result = "";

        for (int i = 0; i <str.length(); i++) {
            char each = str.charAt(i);
            if (i != str.length()-1) {
                result = "-"+each+result;
            } else {
                result = each+result;
            }

        }
        System.out.println("result = " + result);
    }
}
