package courseTasks.firstMonth.secondMonth.day24_Tasks;

public class Task1_FrequenceOfWord {

    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word= "java";

        int count= frequencyOfWord(sentence,word);
        System.out.println("The frequency of your given word is: " + count);  //the frequency of your given word is: 2
    }
    //create a method named frequencyOfWord that passes two parameters
    public static int frequencyOfWord (String sentence, String word){
        int count= 0;
        while (sentence.contains(word)){
            sentence= sentence.replaceFirst(word,"");
            count++;
        }
        return count;
    }

}

/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word,
then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */