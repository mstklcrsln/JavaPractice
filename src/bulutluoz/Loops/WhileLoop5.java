package bulutluoz.Loops;

public class WhileLoop5 {
    public static void main(String[] args) {

        int num= 1453;
        int firstDigit= 0;
        int sumOfDigits= 0;

        while (num!=0) {
            firstDigit=num%10;
            sumOfDigits+= firstDigit;
            num/= 10;
        }
        System.out.println("sumOfDigits = " + sumOfDigits); //sumOfDigits = 13
    }
}
