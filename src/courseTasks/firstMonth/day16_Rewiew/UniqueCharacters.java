package courseTasks.firstMonth.day16_Rewiew;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABCCD";
        String result ="";

        for (int i = 0; i <str.length() ; i++) {
            String ch= "" +str.charAt(i);

            if ( (str.indexOf(ch))== (str.lastIndexOf(ch))) {
                result+= ch;
            }
        }  System.out.print(result);
    }
}

/*
3. Write a program that can return the unique characters from a String
(str.indexOf(ch)== str.lastIndexOf(ch))) {
                result += ch;
			Ex:
				input:
					AABCCD
				output:
				BD
			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique
				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1
				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2
 */