package officeHours.december.secondWeek;

public class BankAccount {
    public static void main(String[] args) {
        /*
        write a java method to calculate total money in ypur bank account
        3 arguents: original amount, rate, year
         */

        investment(1000,200,3);
    }
    public static void investment (double amount, double rate, int year ){
        for (int i = 0; i <year; i++) {
            amount += ( double) amount+ amount*rate;
        }
        System.out.println("Total amount is "+ amount);
        //amount = amount+ amount*rate
    }
}
