package bulutluoz;

public class OverLoading {
    public static void main(String[] args) {

      multiple(3,8); //multiple of two integer 24
        multiple(3,5); //multiple of two integer 15
// methot call sırasında methot parantezine yazılanara argument denir.
        multiple(3.8,9.9); //multiple of two double 37.62
    }
    public static void multiple (int num1, int num2){
        System.out.println("multiple of two integer "+ num1*num2);
    }
    public static void multiple (int num3, int num4, int num5){
        System.out.println("multiple of three  integer "+ num3*num4*num5);
    }
    public static void multiple (double num1, int num2){
        System.out.println("multiple of double and  integer "+ num1*num2);
    }
    public static void multiple (int num1, double  num2){
        System.out.println("multiple of  integer and double  "+ num1*num2);
    }
    public static void multiple (double num1, double num2){
        System.out.println("multiple of two double "+ num1*num2);
    }



}
