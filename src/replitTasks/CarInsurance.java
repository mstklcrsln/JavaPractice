package replitTasks;

import java.util.Scanner;

public class CarInsurance {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        double premiumCost= 0;

        System.out.println("Welcome to the Cydeo car insurance!\nEnter your full name");
        String fullName = scan.nextLine();

        System.out.println("Do you have a US driver license?");
        String licence= scan.next();
        if (licence.toLowerCase().equals("no")) {
            System.out.println("You must have a license to get insurance!");
            System.exit(0);
        }

        System.out.println("Enter your zip code");
        int zipCode= scan.nextInt();
        if (zipCode== 20910 || zipCode==20740) {
            premiumCost+= 60;
        } else if (zipCode==22102 || zipCode==22103) {
            premiumCost +=30;
        } else {
            premiumCost+=50;}
        scan.nextLine();

        System.out.println("Is this vehicle owned, financed, or leased?");
        String ownerShip= scan.next().toLowerCase();
        if (ownerShip=="owned") {
            premiumCost+=10;
        } else if (ownerShip=="financed"){
            premiumCost+=15;
        }else  {
            premiumCost+=20;
        }
scan.nextLine();
        System.out.println("How is this vehicle primarily used?");
        String usingType = scan.next().toLowerCase();
        if (usingType=="business") {
            premiumCost+=50;
            } if (usingType=="pleasure") {
            premiumCost+=10;
        } if (usingType=="commuting") {
            premiumCost+=20;}

            System.out.println("How many days do you commute?");
            int commute = scan.nextInt();
            premiumCost+=commute*5;

            System.out.println("How old are you?");
            int age= scan.nextInt();

            if (age<16) {
                System.out.println("You can't be driving"); 
                System.exit(0);
        } else if (age<=20) {
                premiumCost*=10;
            } else if (age<=25) {
                premiumCost *=6;
            } else {
                premiumCost*=2;
            }

        System.out.println("Have you had any accidents in the last 5 years?");
            String accident = scan.next().toLowerCase();

            if (accident.equals("yes")) {
                System.out.println("How many times");
                int accidentNo= scan.nextInt();
                premiumCost= accidentNo*10;
            }
        scan.nextLine();
        System.out.println("What is the highest level of education you have completed?");
            String educetion = scan.nextLine();
            if (educetion.equals("Bachelors")  || educetion.equals("Masters") ) {
                premiumCost = premiumCost -(premiumCost*0.05);
            }  if (educetion.equals("PHD")) {
                premiumCost = premiumCost - (premiumCost*0.1);
            }if (educetion.equals("High School")) {
                premiumCost =premiumCost+ (premiumCost*0.5);
        }

        int p=fullName.indexOf(" ");
        fullName=fullName.substring(0,1).toUpperCase()+fullName.substring(1,p)+" "+fullName.substring(p+1, p+2).toUpperCase()+fullName.substring(p+2);


        System.out.println(fullName + ", here's your quote!\nThis is your start premium cost: $" + premiumCost);
        System.out.println("This is your reference number:" + fullName.substring(0,2).toUpperCase()+ age+fullName.substring(fullName.length()-3,fullName.length()).toUpperCase()+ zipCode+educetion);
    }
}


























