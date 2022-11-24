package octoberTasks.day13Works;
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Split or No split (Yes or No)");
       // String split= scan.next().toLowerCase(); //

        System.out.println("Number of people entered: ");
        int numberOfPeople = scan.nextInt();

      //  System.out.println("Enter check amount");
       double checkAmount = scan.nextDouble();

        scan.nextLine();
        System.out.println("Service quality");
        String serviceQuality= scan.next().toLowerCase(); // muhtar change to lowercase to use lowercase

        double totalTip= 0;

        if (serviceQuality.equals("Excellent")) {
            totalTip=checkAmount*25/100;
        } if (serviceQuality.equals("Great")) {
            totalTip=checkAmount*20/100;
        }if (serviceQuality.equals("Good")) {
            totalTip = checkAmount * 15 / 100;
        } if(serviceQuality.equals( "Fair")){
            totalTip= checkAmount*10/100;
       } if (serviceQuality.equals("Poor")){
        totalTip= checkAmount*5/100;}

        double totalPay= totalTip+checkAmount;
        double totalPerPerson = totalPay/numberOfPeople;
        double tipPerPerson = totalTip/numberOfPeople;

        System.out.println("numberOfPeople = " + numberOfPeople);
        System.out.println("totalPay = " + totalPay);
        System.out.println("totalPerPerson = " + totalPerPerson);
        System.out.println("tipPerPerson = " + tipPerPerson);
scan.close();
}}

