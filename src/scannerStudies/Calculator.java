package scannerStudies;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your hourly rate?");
        double hourlyRate= scan.nextDouble();

        System.out.println("How many hour are you working in a week?");
        int workingHour = scan.nextInt();

        System.out.println("What is your state tax rate?");
        double stateTaxRate = scan.nextDouble();

        System.out.println("What is your federal tax rate?");
        double fedaralTaxRate = scan.nextDouble();
        scan.close();


        double salary = hourlyRate*workingHour*52;
        double stateTax = salary*stateTaxRate;
        double federalTax = salary*fedaralTaxRate;
        double totalTask = stateTax+federalTax;
        double netIncome = salary-totalTask;

        System.out.println("salary = " + salary);
        System.out.println("stateTax = " + stateTax);
        System.out.println("federalTax = " + federalTax);
        System.out.println("totalTask = " + totalTask);
        System.out.println("netIncome = " + netIncome);


    }
}
/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */