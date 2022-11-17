package bulutluoz.Loops;

import java.util.Scanner;

public class WhileLoop2 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan toplamak üzere sayı alın sayıarın toplamı 500'e eşit ya da geçerse toplamı
        yazdırıp "bu kadar yeter" yazdırın
         */

        Scanner scan =new Scanner(System.in);
        int num =0;
        int sum =0;
        int count =0;

                while (sum<500) {
                    System.out.println("Enter number for addition");
                    num= scan.nextInt();
                    count++;
                    sum+=num;

                }
        System.out.println("Entered " + count+ " numbers addition "+ sum );
    }
}
