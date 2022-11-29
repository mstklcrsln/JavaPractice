package officeHours;

public class Vowels {

    public static void main(String[] args) {

        /*
            print only vowels in given word
            a,e,i,o,u,
            home ==> o, e
         */
        String word= "aasdfghghkjhkhfczxsfeferwewretrytu";
        String result= "";

        for (int i = 0; i < word.length(); i++) {
        char ch= word.charAt(i);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            result += ch;
        }

        }

        System.out.print(result); // aaeeeeu

        System.out.println("---------------");


        /*
        password checker, 3 guess
         */

        String pass= "Cydeo12";
        int count =0;
        for (int i = 0; i <pass.length() ; i++) {
            char ch= pass.charAt(i);
            //if ((ch>'a' && ch< 'z') && (ch<'Z' && ch > 'A') && (ch))

        }
    }
}

