package courseTasks.firstMonth.day15_ForLoops;

public class Bulutluoz {
    public static void main(String[] args) {

        String str= "Java";
      //  System.out.println(str.repeat(10));JavaJavaJavaJavaJavaJavaJavaJavaJavaJava

        for (int i = 0; i <10 ; i++) {
            System.out.print(" " + i);  // 0 1 2 3 4 5 6 7 8 9
        }
        System.out.println();
            // 2 baamaklı 7  ile bölünebilen
        for (int i = 10; i <100 ; i++) {
            if (i%7==0) {
                System.out.print(i); //14212835424956637077849198
            }
        }
        System.out.println();
        // 13'ten başlayıp 100'e kadar 7'şer arttır
        for (int i = 13; i < 100; i+=7) {
            System.out.print(i + " "); //13 20 27 34 41 48 55 62 69 76 83 90 97
        }
        System.out.println();
        // 1'den 10 a kadar (sınırlar dahil) sayıalrın kareleri
        for (int i = 1; i <10 ; i++) {
            System.out.print(i*i + " "); //1 4 9 16 25 36 49 64 81
        }
        System.out.println();
        //faktoryel
        int sayi =10;
        int faktoryel= 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel= faktoryel*i;
                    }
        System.out.println(faktoryel); //3628800

        System.out.println();
        // birden 100'e kadar syilari toplayin
        int toplam=0;
        for (int i = 0; i <=100 ; i++) {
            toplam +=i;
                    }
        System.out.print(toplam); //5050

        System.out.println();
        String input= "Java candir ";
        String ters= "";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i)); //ridnac avaJ

            ters+= input.substring(i,i+1);
        }
        System.out.println();
        System.out.println(ters); //ridnac avaJ


        System.out.println();

        String a12 = "Java";
        String tesr1 ="";

        for (int i = a12.length()-1; i >=0 ; i--) {
            tesr1 += a12.charAt(i);

        }
        System.out.println("tesr1 = " + tesr1); //tesr1 = avaJ
        }
    }
