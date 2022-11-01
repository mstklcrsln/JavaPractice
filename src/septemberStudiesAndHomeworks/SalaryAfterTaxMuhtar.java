package septemberStudiesAndHomeworks;

public class SalaryAfterTaxMuhtar {
    public static void main(String[] args) {

        double salary = 95000;
        boolean isMarried = true;
        double taxRate = 0;

        if (salary >= 130_000) { // false salary is less than 130.000
            taxRate = 0.35;
        } else if (salary >= 100_000) { // false salary <100000
            taxRate = 0.3;
        } else if (salary >= 80000) { // false salary <80000
            taxRate = 0.25;
        } else {
            taxRate = 0.2;}

        if (isMarried) { // if the person is married
            taxRate-= 0.05; // subtracting 5% from the original tax rate
        }

        double salaryAfterTax = salary - (salary*taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);
    }
}
