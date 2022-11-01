package bulutluoz;

public class Method2 {

    public static void main(String[] args) {
        int num= 24;
        System.out.println(primeControl(num)); //not prime
        System.out.println(primeControl(23)); //prime
        System.out.println(primeControl(173));
    }
    public static String primeControl (int num) {
String sonuc= "";
        for (int i = 2; i <=(num-1) ; i++) {
            if (num%i==0) {
                sonuc= "not prime";
                break;
            }

        }
        if (!sonuc.equals("not prime")){
            sonuc= "prime";
        }
        return sonuc;
    }



}
