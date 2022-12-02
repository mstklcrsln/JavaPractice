package courseTasks.firstMonth.Day20_Tasks;

public class Task7 {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        for (int i = 0; i < items.length; i++) {

            String itemName= items [i];
            double itemPrice = prices [i];
            int itemID = itemIDs [i];

            if (itemName.equals("Gloves")) {
                int index = i;
                System.out.println("Index of Gloves is "+ index);
        }
            if (itemName.equals("iPad")) {
                boolean hasIPad = true;
                System.out.println("hasIPad = " + hasIPad);
            }
            System.out.println("Item name is "+ itemName+ " Price is "+ itemPrice+ " ItemId is " + itemID);
        }
    }
}
/*
3. Given the following arrays:
        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};
        1. find out the first index number of "Gloves"
        2. find out if "iPad" is contained in the item list
        3. Print the report of each shopping item
            name - price - #ID
 */