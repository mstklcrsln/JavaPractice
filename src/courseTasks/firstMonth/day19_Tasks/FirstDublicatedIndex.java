package courseTasks.firstMonth.day19_Tasks;

public class FirstDublicatedIndex {
    public static void main(String[] args) {

        String str = "aaabbccccddeeeeeeffgggggghh";
        String result = "";

        for (int i = 0; i <str.length() ; i++) {
            int count= 0;

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) ==str.charAt(j)){
                    count++;
                }
            }
            if (count==2 && !result.contains(""+ str.charAt(i))){  //if a character appears twice and the string "result" doesn't contain this character, it will be added to "result"
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }
}



/*
//3. Write a program that can display all the characters that appeared twice in the string.
 */