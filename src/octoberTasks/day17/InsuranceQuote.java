package octoberTasks.day17;

import java.util.Scanner;

public class InsuranceQuote {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scan.nextLine();

        System.out.println("Enter your gender");
        String gender = scan.next().toLowerCase();

        while (!((gender.equals("male")) || (gender.equals("female")))) {
            System.err.println("Invalid entry. Please enter your gender");
            gender= scan.next().toLowerCase();
        }
        System.out.println("Are you married? Yes / No");
        String married = scan.next().toLowerCase();
         while ( !((married.equals("yes")) ||(married.equals("no"))) ) {
             System.err.println("Invalid entry. Please enter yes or no");
             married = scan.next().toLowerCase();
         }
        System.out.println("Enter your age");
         int age = scan.nextInt();
        while (!(age>=0 && age<=120)) {
             System.out.println("Invalid entry. Please enter your age");
           age= scan.nextInt();}
        System.out.println("how many miles do you drive in a day");
         double mile = scan.nextDouble();
         while ( ! (mile>5) )  {
             System.err.println("Invalid entry. Please enter bigger than five");
              mile = scan.nextDouble();
         }
        System.out.println("Do you want full coverage or liability insurance?");
        scan.nextLine();
         String choice  = scan.nextLine().toLowerCase();
        while ( !(choice.equals("coverage"))  && !(choice.equals("liability")) ) {
            System.err.println("Invalid entry. Please enter your choice");
            choice= scan.nextLine().toLowerCase();
        }
        System.out.println("Had you any accidents or claims in past 5 years? yes/no?");
        String accident = scan.next().toLowerCase();
        while(!(accident.equals("yes") || accident.equals("no"))) {
             System.err.println("Invalid entry. Please enter your choice");
             choice= scan.nextLine().toLowerCase();
         }
        System.out.println("Has your car an anti-theft device? yes/no");
         String device = scan.next().toLowerCase();
        while ( ! (device.equals("yes") || device.equals("no"))) {
            System.err.println("Invalid entry. Please enter your choice");
            choice= scan.nextLine().toLowerCase();}

        double price=0;

        if (choice.equals("liability")) {
            if (age<25) {
                price+=90;
            } else  {
                price +=50;
            }
            if (mile<=10) {
                price+=10;
            } if (mile>11) {
                price+=50;
            }

        } else {
            if (age<25) {
                price+=160;
            } else {
                price+= 120;
            }
            if (mile>11) {
                price+=70;
            }}
        double discountRate = 0;
            if (device.equals("yes")) {
                price+=0.05;
            }
            if (accident.equals("yes")) {
                price-=0.15;
            }
            if (married.equals("yes")) {
                price+= 0.05;
            }
        double totalPrice = price* (1-discountRate);

        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("married = " + married);
        System.out.println("choice = " + choice);
        System.out.println("price = " + price);
        System.out.println("Your total price is :" + totalPrice);
    }
}
