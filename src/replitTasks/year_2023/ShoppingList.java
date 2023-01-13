package replitTasks.year_2023;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport= "";
        String item = "";
        String continues = "";
       double price= 0;
       int count = 1;
       double totalPrice = 0;

       do {

           System.out.println("Enter item" + count + " and its price: ");
           item = scan.next();
           price = scan.nextDouble();
           totalPrice += price;

           shoppingListReport += "item " + count + item + " price: " + price;


           System.out.println("Add one more item");
           continues = scan.next();

           if (continues.equals("yes")) {
               shoppingListReport += ", ";
           }
           count++;
       } while ((continues.equals("yes") && count<= 10));
        System.out.println(shoppingListReport);
        System.out.println(totalPrice);



    }
}
