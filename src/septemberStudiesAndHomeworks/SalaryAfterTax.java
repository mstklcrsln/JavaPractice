package septemberStudiesAndHomeworks;

public class SalaryAfterTax {

    public static void main(String[] args) {

        boolean isMarried = true;
        int salary = 150000;
        int tax ;
        if (salary > 130_000) {
            tax = 35;
        } else if (salary >= 100_000 && salary < 130_000) {
            tax = 30;
        } else if (salary >= 80_000 && salary < 100_000) {
            tax=25;
        } else {
            tax = 20;
        }

        if (isMarried) {
            tax-=5;
        } else {
            tax=tax;
        }
        int salaryAfterTax = salary - salary * tax / 100;
        System.out.println(salaryAfterTax);

    }}

      /*  int salaryBeforeTax = 79000;
        String marriedOrNot = "marrieds";

        if (salaryBeforeTax >= 130_000 && marriedOrNot == "married"){
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 30 /100));
        } else if (salaryBeforeTax >= 130_000 && marriedOrNot != "married") {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 35 /100));
        } else if ((salaryBeforeTax >= 100_000 && salaryBeforeTax < 130_0000) && marriedOrNot == "married") {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 25 / 100));
        } else if ((salaryBeforeTax >= 100_000 && salaryBeforeTax < 130_0000) && marriedOrNot != "married") {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 30 / 100));
        } else if ((salaryBeforeTax >= 80_000 && salaryBeforeTax < 100_0000) && marriedOrNot == "married") {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 20 / 100));
        } else if ((salaryBeforeTax >= 80_000 && salaryBeforeTax < 100_0000) && marriedOrNot != "married") {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 25 / 100));
        } else if (salaryBeforeTax < 80_000 && marriedOrNot == "married") {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 15 / 100));
        }else {
            System.out.println(salaryBeforeTax - (salaryBeforeTax * 20 / 100));
        }

    }

}
   /* public static void main(String[] args) {
        int salary = 80000;
        boolean isMarried = true;
        double taxRate1;
        double taxRate2;
        double taxRate3;
        double taxRate4;

        if (isMarried == false) {
            taxRate1 = 0.35;
            taxRate2 = 0.30;
            taxRate3 = 0.25;
            taxRate4 = 0.20;
        } else {
            taxRate1 = 0.3;
            taxRate2 = 0.25;
            taxRate3 = 0.2;
            taxRate4 = 0.15;
        }

        double netIncome=

*/