package officeHours.december.secondWeek;

public class LeaoYearMethod {
    public static void main(String[] args) {

        /* write a program which writes leap year. return boolean
        year should be divisible by 4
        year can not only divisible by 100
        year should be divisible by 100 and 400 at the same time*/
        System.out.println(isLeap(2000)); //true
    }
    public static boolean isLeap (int year){
        boolean a= (year%4)==0;
        boolean b= (year%100) != 0;
        boolean c = (year%100) == 0 && (year%40)==0;

       return a && (b || c);
    }
}
