package NovemberStudiesAndTasks.day22;

public class Day22_Task2 {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
/*
1. print the following output: (add \t between two words)
				Apple    Banana   Grape    Avocado
				Paper Towels     Toilet Papers   Tissues    Diapers
				Coke   Fanta   Arizona Tea   Pepsi   Water
 */
        for (int i = 0; i <items.length ; i++) {
            for (int j = 0; j <items[i].length; j++) {
                System.out.print(items[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("-----------------------");
       /* 2. print the following output: (add \t between two words)
        Avocado   Grape    Banana    Apple
        Diapers   Tissues   Toilet Papers   Paper Towels
        Water    Pepsi    Arizona Tea    Fanta   Coke*/
        for (int i = 0; i <items.length ; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items[i][j] + " ");
            }
            System.out.println();
            }
        System.out.println("--------------------------");
        /*		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j =0; j <items[i].length; j++) {
                System.out.print(items[i][j] + " ");
            }
            System.out.println();
        }
        }
    }



