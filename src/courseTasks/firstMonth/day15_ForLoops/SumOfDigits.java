package courseTasks.firstMonth.day15_ForLoops;

public class SumOfDigits {
    public static void main(String[] args) {
        String str= "g35g54g6k6577kbk6";
            int sum= 0;


        for (int i = 0; i <=str.length()-1 ; i++) {

            if (str.charAt(i)>=0 && str.charAt(i)<=9) {
                int digit= str.charAt(i)-48;
                sum=sum+digit;
            }
            System.out.println("sum = " + sum);
    }
}}

/*       for (int i =0;i<st.length();i++){
           if(st.charAt(i)>='0' && st.charAt(i)<='9'){
               int digit = st.charAt(i)-48;
               sum=sum+digit;
 */



     /*




            if (ch<='9' && ch>=0) {
                digits+=ch;
            }else {

            }

        */