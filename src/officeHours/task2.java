package officeHours;

public class task2 {

    public static void main(String[] args) {


    String str = "amazon";
    char[] str1 = str.toCharArray();

    String newStr = "";
        for (int i = str1.length - 1; i >= 0; i--) {
        newStr += str1[i];
        if (i == 0) {
            break;
        }
        newStr += "-";
    }
        System.out.println(newStr);
}
}

