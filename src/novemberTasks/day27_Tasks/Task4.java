package novemberTasks.day27_Tasks;

import java.time.LocalDate;

public class Task4 {

    public static void main(String[] args) {


        String str = "JAVA java";
        int upperLetters = 0;
        int lowerLetters = 0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upperLetters++;
            } else if (Character.isLowerCase(each)) {
                lowerLetters++;
            }
        }
            boolean isEqual = upperLetters == lowerLetters;
            System.out.println("isEqual = " + isEqual); //true
            //
        }


    }
/*
4. Write program that returns true if the total number of upper case characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";
		output:
			true
 */