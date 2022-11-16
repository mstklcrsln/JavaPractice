package octoberStudiesAndHomeworks.day19_Tasks;

public class HighestFrequency {
    public static void main(String[] args) {

        String str = "mesuttttttt kılıçarslan ooooooooooooooooooooooooooooorom turkey and live in tttttttttttttturkey.";
        String result = "";
        int max =0;

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char ch = str.charAt(i);

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }
            }
            if (count>max) {
               result= ""+ str.charAt(i);
                max=count;
                result+=count;
            }
    }
        System.out.println(result);
    }
}

/*
6.  Write a program that can find the character that has the highest frequency from a string
String str = "Java is very awful."; // this rules apply to any given string
        String result = ""; // this will hold the most frequent character
        int max = 0; // put here, because it shouldn't be affected by cycle/loop
        for (int i = 0; i < str.length(); i++) { // this will hold a character to check in every cycle of inner loop
            int count = 0; // We put here, because we want it to be 0 after every cycle
            for (int j = 0; j < str.length(); j++) { // this will change the character in every cycle in order to check if the character(i) equals or not
                if(str.charAt(i) == str.charAt(j)){ // this will count the frequency of character
                    count++;
                }
            }
            if(count > max){ // this checks if the current frequency is bigger than previous one
                result = "" + str.charAt(i); // this will add the most frequent character
                max = count; // in every cycle if the current frequency is bigger than previous one, max will change as new one
            }
        }
        System.out.println(result); // if there are two most frequent character, the first one (related to index) will be printed
 */