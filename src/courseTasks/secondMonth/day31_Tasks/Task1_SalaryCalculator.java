package courseTasks.firstMonth.secondMonth.day31_Tasks;

public class Task1_SalaryCalculator {

    public int weeklyHours;
    public double hourlyRate, stateTaxRate, federalTaxRate;

    double totalStateTax= salary()*stateTaxRate/100;
    double totalFederalTax= salary()* federalTaxRate/100;

    public Task1_SalaryCalculator(int weeklyHours, double hourlyRate, double stateTaxRate, double federalTaxRate) {
        this.weeklyHours = weeklyHours;
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }
    public double salary (){
        double salary= hourlyRate * weeklyHours * 52;
    return salary;
    }
    public double  StateTaxRate() {
      double  totalStateTax = salary()*stateTaxRate/100;
        return totalStateTax;
    }
    public double federalTax() {
        double totalFederalTax= salary()*federalTaxRate/10;
        return totalFederalTax;
    }
    public double salaryAfterTax() {
        double totalSalaryAfterTax = salary()- (totalFederalTax+totalStateTax);
        return totalSalaryAfterTax;
    }

    public String toString() {
        return "Task1_SalaryCalculator{" +
                "weeklyHours=" + weeklyHours +
                ", hourlyRate=" + hourlyRate +
                ", stateTaxRate=" + stateTaxRate +
                ", federalTaxRate=" + federalTaxRate +
                '}';
    }

}
/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object
 */