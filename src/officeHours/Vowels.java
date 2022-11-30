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
    }
}

