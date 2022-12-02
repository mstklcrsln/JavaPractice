package courseTasks.firstMonth.day16_Rewiew;

public class Reverse {
    public static void main(String[] args) {

        String str = "Wooden Spoon";
        String result = "";

        for (int i = str.length()-1;  i >=0 ; i--) {
            char ch= str.charAt(i);
            result += ch;
        }
        System.out.println(result);
    }
}
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */
