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
/*
5. Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
            Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
            		if frequency of a character == 1  =========> unique

 */