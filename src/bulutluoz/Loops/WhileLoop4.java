package bulutluoz.Loops;

public class WhileLoop4 {
    public static void main(String[] args) {


        // uslu sayı hesaplama
        int num=5;
        int us =3;

usHesapla(num,us); //125
        usHesapla(5,9);//1953125
        usHesapla(13,2); //169
            usHesapla(2,2);//4


    }
    public static void usHesapla (int num, int us) {
        int result= 1;

        while (us >0) {
            result*=num;
            us--;
        }
        System.out.println(result);
    }
}
