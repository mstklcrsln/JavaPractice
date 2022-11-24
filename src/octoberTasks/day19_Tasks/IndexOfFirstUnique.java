package octoberTasks.day19_Tasks;

public class IndexOfFirstUnique {
    public static void main(String[] args) {


        String str = "aabbccdideeff"; // this can be any string
        String result = ""; // result will be kept here


        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                if (str.charAt(i)==str.charAt(j)) {
                    count++;
                }
            }
            if (count<2) {
                System.out.println(str.indexOf(str.charAt(i)));
            }

        }
    }
}
/*
 if(counter < 2){
                System.out.println(str.indexOf(str.charAt(i)));
                System.exit(0);



        String str = "aabbccddeeff"; // this can be any string



        for (int i = 0; i < str.length(); i++) { // this will hold a character to check in the inner loop

            int count = 0; // put here so that it can be 0 for each control

            for (int j = 0; j < str.length(); j++) { // this will change the character in every cycle to check if it has repeat

                if(str.charAt(i) == str.charAt(j)){ // this compares the character(i) with the rest of the characters

                    count++; // in each match, count will increase  !!! character's itself will be checked as well, and it increases the count

                }

            }
if( !(result.contains(""+str.charAt(i))) ){ // this checks if result doesn't contain the checked character
                result += ""+str.charAt(i); // first if result doesn't contain the checked character, character will be added


            if(count == 1){ // this checks whether in the string, a character occurs only one time

                result += str.charAt(i); // a character occurs only one time, it will be added to result

            }

        }

        System.out.println(result); // this will print all unique characters. if there is no unique character, it will print nothing

    }
}
 */