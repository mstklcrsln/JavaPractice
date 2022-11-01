package septemberStudiesAndHomeworks;

public class Finra {
    public static void main(String[] args) {
        int n1 = 210;
        String result = "";

        if (n1 % 3 == 0 && n1 % 5 == 0) {
            result = "FINRA";
        } else if (n1 % 3 == 0) {
            result = "FIN";
        } else if (n1 % 5 == 0) {
            result = "RA";
        } else {
            result = "Invalid";
        }
        System.out.println("result = " + result);
    }}

      /*  int num = 155;



        if(num%15==0 ){
            System.out.println("FINRA");
        } else if (num%3==0) {
            System.out.println("FIN");
        }else if (num%5==0){
            System.out.println("RA");
        }else {
            System.out.println("invalid Number");
        }*/

