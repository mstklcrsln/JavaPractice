package septemberStudiesAndHomeworks;

public class Loans {
    public static void main(String[] args) {

        int salary = 50000;
        double creditgrade = 750;

       String result =  (salary> 60000 && creditgrade >650)? "Loan aproved" : "Loan Denied";

        System.out.println("result = " + result);


    }
}
