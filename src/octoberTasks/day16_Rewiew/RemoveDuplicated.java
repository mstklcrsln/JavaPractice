package octoberTasks.day16_Rewiew;

public class RemoveDuplicated {
    public static void main(String[] args) {
        String str = "AABBCCBC";
        String result= "";

        for (int i = 0; i <= str.length()-1 ; i++) {
            String  ch= ""+ str.charAt(i);

            if ( !(result.contains(ch)) ) {
                result += ch;
            }
        }  System.out.print(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String 
				  Condition: the character is not contained in the other String yet before you are adding

				   for (int i = 0; i <= ste.length()-1; i++) {  // i represents all the index numbers starting from 0
        String ch= "" +ste.charAt(i);                             // represents each character of ste
                                                                                // writes  each line a a b b c c

            if (!result.contains(ch)) {  // if the character is not contained in the result
            result += ch;  // without if statement only this writes  aabbaacc
 */