package octoberStudiesAndHomeworks.day16_Rewiew;

public class Frequence {
    public static void main(String[] args) {
        String sentence= "Java Java";
        int freq = 0;
        for (int i = 0; i <sentence.length()-3 ; i++) {
            String each= sentence.substring(i,i+4);
           // System.out.println(each);
            if (each.equals("Java")) {
                freq++;
            }
        }
        System.out.println(freq);
    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence
        Ex:
            sentence = "Java Java";
                       output:
                2
            Hint: you need to create
 for (int i = 0; i < str.length()-3 ; i++) {
                            // i <=str.length()-4
           String eachSub=  str.substring(i,i+4); // it gives error about  begin 5, end 9, length 8. we added 4 each subs.  Because there is no index number of 8,9,10
                                                                        // for solve this problem we use -4 in the condition
        //  System.out.println(eachSub);    //Java    avaJ        vaJa     aJav Java    avaJ        vaJa      aJav Java    avaJ     vaJa             aJav

                if (eachSub.equals("Java")) {
                    frequency++;
                }
        }
        System.out.println(frequency); //8
 */