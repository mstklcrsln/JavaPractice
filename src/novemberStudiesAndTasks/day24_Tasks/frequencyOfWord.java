package novemberStudiesAndTasks.day24_Tasks;

public class frequencyOfWord {
    public static void main(String[] args) {

        String  sentence = "Java java java python python";
        String given= "java";

        int count = frequencyOfWord(sentence,given);
        System.out.println("count = " + count);
    }

    public static int frequencyOfWord (String sentence, String given){
        int count= 0;
        while (sentence.contains(given)) {
            sentence= sentence.replaceFirst(given,"");
            count++;
        }
        return count;
    }

}

/*
1.  create a method named frequencyOfWord that passes two parameters: string sentence and String word, then returns the frequency of word from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3

 */