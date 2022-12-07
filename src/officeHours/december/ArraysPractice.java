package officeHours.december;

import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {
/*
Write 10 numbers in array and find sumof even and odd numbers
 */
        int [] numbers= new int[10];
        int odd=0;
        int even=0;

        for (int i = 0; i <=9 ; i++) { // this loop is for putting numbes to array
            numbers[i]=i;  //we sign arrays index numbers to number i
        }
        for (int i = 0; i <10 ; i++) {  // we check every numbers, if even put them into even...
            if (i%2==0){
                even+=i;
            } else{
                odd+=i;
            }
        }
        System.out.println(even);
        System.out.println(odd);
        System.out.println("--------------------");

        /*
        write a progaram to input 10 numbers in array and reverse that array
         */

        int [] num = new int[10];
        for (int i = 0; i <10 ; i++) {
            num[i]=i;
        }
        for (int i = 9; i >=0 ; i--) {
            num[9-i]=i;
        }
        System.out.println(Arrays.toString(num)); //[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

        System.out.println("----------------------");

        /*
        Cretate email list as @gmail for given names
        "harold", "jack", "ahmet", "sakushi", "mesut"
         */
        String [] names = {"harold", "jack", "ahmet", "sakushi", "mesut" };
        for (String name: names){
            System.out.println(name+ "gmail.com");
        }
            /*
            haroldgmail.com
            jackgmail.com
            ahmetgmail.com
            sakushigmail.com
            mesutgmail.com
             */

        System.out.println("-------------------------");
        //calculate the total salary
            String [] names1 = { "Harold8000", "Mesut3000", "Veli1000", "Ali9000"};

        int total= 0;
        for (String name : names1){
        total +=  Integer.valueOf(name.substring(name.length()-4));
        }
        System.out.println("total = " + total); //total = 21000
    }
}
