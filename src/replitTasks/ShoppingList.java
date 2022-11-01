package replitTasks;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String itemName = "",
                answer = "",
                shoppingList = "",
                yesOrNo = "";

        double itemPrice = 0,
                totalCost = 0,
                priceOfQuantity = 0;
        int quantity = 0,
                itemNumber = 0;

        do {
            System.out.println("Enter the name of item " + ++itemNumber);
            itemName = scan.next();

            System.out.println("Enter the price of " + itemName);
            itemPrice = scan.nextDouble();

            System.out.println("How many " + itemName + " will you buy?");
            quantity = scan.nextInt();

            System.out.println("Do you want to add more items to the shopping list?");
            yesOrNo = scan.next();

            shoppingList +=  itemName+ " x " + quantity + " - $" + itemPrice*quantity;
        }  while (answer.equals("yes"));



            System.out.println("SHOPPING LIST:");

            System.out.println("Total cost: $" + totalCost) ;
        }

    }

      /*  String itemName= "";
        int ite}mNumber=0;
        String answer= "";
        double itemPrice=0;
        int itemCount = 0;
        double totalCost= 0;
        String shoppingList= "SHOPPING LIST:";


        System.out.println("Enter the name of item" + itemNumber++);
        answer= scan.next();

        System.out.println("Enter the price of the" + itemName);
        itemPrice= scan.nextDouble();

        System.out.println("How many"+ itemName+ "will you buy?");
        itemCount= scan.nextInt();

        totalCost+= itemCount*itemPrice;
        shoppingList += "\n" + itemName+ " x " + itemCount + " - $" + itemPrice*itemCount;

        scan.nextLine();

        System.out.println("Do yuo want add more items to the shopping list?");
        answer= scan.next();

        while (answer.equals("yes")) {
            scan.nextLine();
            System.out.println("Enter the name of item");
            answer= scan.next();

            System.out.println("Enter the price of the" + itemName);
            itemPrice= scan.nextDouble();

            System.out.println("How many"+ itemName+ "will you buy?");
            itemCount= scan.nextInt();

            totalCost+= itemCount*itemPrice;
            shoppingList += "\n" + itemName+ " x " + itemCount + " - $" + itemPrice*itemCount;

            scan.nextLine();

            System.out.println("Do yuo want add more items to the shopping list?");
            answer= scan.next();

        }

        System.out.println(shoppingList + itemName + "\nTotal cost: $" + totalCost);
*/
