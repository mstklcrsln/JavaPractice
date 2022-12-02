package courseTasks.firstMonth.day19_Tasks;

public class FirstDublicated {
    public static void main(String[] args) {

        String str = "aaabbccccddeeeeee";
        String result = "";



        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if (ch == each) {
                    count++;
                }

            }
            if (count == 2) {
                result+=ch;
                System.out.println("" +result);  //b
                break;
            }
        }System.out.println(result);  //bb
    }
}
/*
1. Write a program that can return the first duplicated character from a string
String str= "aaabbccccddeeeeee"
result= bd;
 */