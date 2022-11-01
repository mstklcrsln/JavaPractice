package septemberStudiesAndHomeworks;

public class CappuchinoBuyer {
    public static void main(String[] args) {

        String size = "venti";
        double price = 0;
        int calories = 0;

        switch (size) {
            case ("tall"):
                price= 3.69;
                calories= 90;
                break;

            case ("grande"):
                price= 3.99;
                calories= 120;
                break;

            case  ("venti"):
                price= 4.29;
                calories= 150;
                break;

            default:
                System.out.println("Invalid Size");
                break;
        }
        if (price!=0) {
            System.out.println("Your choise is " + size);
            System.out.println ("Price is $ " + price);
            System.out.println(calories+ " calories");
        }

    }}