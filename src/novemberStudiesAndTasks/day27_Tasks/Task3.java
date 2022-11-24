package novemberStudiesAndTasks.day27_Tasks;

public class Task3 {
    public static void main(String[] args) {

    String str = "Wooden1235!'^++% Spoon!";

    String letters= "";
    String digits= "";
    String special= "";

        for (char eachChar : str.toCharArray()){
            if (Character.isDigit(eachChar)){
                digits += eachChar;
            } else if (Character.isLetter(eachChar)){
                letters += eachChar;
            }else {
                special += eachChar;
            }
        }
        System.out.println("special = " + special); //special = !'^++% !
        System.out.println("digits = " + digits);   //digits = 1235
        System.out.println("letters = " + letters); //letters = WoodenSpoon
    }
}
/*
3. Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"
		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */