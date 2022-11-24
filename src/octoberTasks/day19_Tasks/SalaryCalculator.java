package octoberTasks.day19_Tasks;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        while (true) {
            System.out.println("How much you make an hour?");
            double hour = scan.nextDouble();

            if (hour == 0 || hour < 0) {
                System.out.println("Invalid Entry for Hourly Rate");
                System.exit(0);
            }

            System.out.println("How many hours do you work per week?");
            double hourPerWeek = scan.nextInt();

            if (hourPerWeek < 1 || hourPerWeek > 144) {
                System.out.println("Invalid Entry for Weekly Hours");
                System.exit(0);
            }
            System.out.println( "Enter your state tax rate");
            int taxRate = scan.nextInt();

            if(taxRate<0 || taxRate>10){
                System.err.println("Invalid Entry for state tax Rate");
                System.exit(0);}

            double federalTax = 0.26;
            double grossSalary = hour * hourPerWeek * 52;
            double stateTax = grossSalary * federalTax;
            double totalTax = federalTax + stateTax;
            double netIncome = grossSalary - totalTax;

            System.out.println("Gross Salary: " + grossSalary);
            System.out.println("State Tax: " + stateTax);
            System.out.println("Total Tax: " + totalTax);
            System.out.println("Net Income: " + netIncome);

            System.out.println("Would you like to continue? yes/no");
            String answer = scan.next().toLowerCase();

            while ( !( answer.equals("yes") || answer.equals("no")) ) {
                System.err.println("Invalid Entry");
                System.exit(0);
            }

            if (answer.equals("no")) {
                System.out.println("Thank you for using Cydeo Salary Calculator APP");
                break;
            }
        }
    }
}
