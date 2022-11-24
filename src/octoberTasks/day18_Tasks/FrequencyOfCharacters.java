package octoberTasks.day18_Tasks;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
      String str= "aabcccd";
        String  freq= "";
        int count=0;

                for (int j = 0; j < str.length(); j++) {
                    char ch = str.charAt(j);
                    count = 0;
                    for (int i = 0; i < str.length(); i++) {
                        char each = str.charAt(i);

                        if (ch == each) {
                            count++;
                        }

                    }
                    if (freq.contains("" + ch)) {
                        continue;
                    }
            freq += ch;
            freq += count;
        }
        System.out.println(freq);
    }
}
/*
      String str= "aabcccd";
        String result= "";

        for (int j = 0; j <str.length() ; j++) {

        char ch= str.charAt(j);
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (ch==each) {
                count++;
            }
        }

        if (result.contains(""+ ch)) {
            continue;       // if the character is already in the result it will skip it
        }
        result+=ch;
        result+=count;

        }
        System.out.println(result);         //a2b1c3d1
        // System.out.println(result); //a2a2b1c3c3c3d1

}

4. Write a program that can find the frequency of the characters from a string
			 Ex:
                        str = "aabcccd";
                        output:
                                a2b1c3d1
            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters
 */
