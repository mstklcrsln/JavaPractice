package octoberStudiesAndHomeworks.day18_Tasks;

public class UniqueCharacter {
    public static void main(String[] args) {
        String str=  "aabccdeef";
        String result= "";

        for (int j = 0; j < str.length(); j++) {
            char ch= str.charAt(j);
            int count=0;

            for (int i = 0; i <str.length() ; i++) {
                char each = str.charAt(i);
                if (ch==each) {
                    count++;
        }
            }  if(count==1){
                    result+=ch;
        }
        }
        System.out.println(result);
}}
