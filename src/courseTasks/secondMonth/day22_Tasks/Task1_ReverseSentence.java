package courseTasks.firstMonth.secondMonth.day22_Tasks;

public class Task1_ReverseSentence {
    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String[] newSentence = sentence.split(" ");
        //System.out.println(Arrays.toString(newSentence));
        String result = "";
        for (int i = newSentence.length - 1; i >= 0; i--) {
            result += newSentence[i]+ " ";

        }
        System.out.println(result); //Java learn to day good a is Today
    }
}

/*

        1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */