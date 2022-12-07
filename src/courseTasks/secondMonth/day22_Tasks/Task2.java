package courseTasks.firstMonth.secondMonth.day22_Tasks;

public class Task2 {
    public static void main(String[] args) {
        String [][] items= {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        for (String[] eachItem : items) {
            for (String eachElement : eachItem) {
                System.out.print(eachElement+ "\t");
            }
                System.out.println();
        }
        System.out.println("-------------");
        for (int i = 0; i < items.length; i++) {
            for (int j = items[i].length - 1; j >= 0; j--) {
                System.out.print(items [i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println("-------------");
        for (int i = items.length - 1; i >= 0; i--) {
            for (int j = 0; j < items[i].length; j++) {
                System.out.print(items [i][j]+ "\t");
            }
            System.out.println();
            }
      }
}

/*
		3. print the following output: (add \t between two words)
				Coke   Fanta   Arizona Tea   Pepsi   Water
				Paper Towels     Toilet Papers   Tissues    Diapers
				Apple    Banana   Grape    Avocado
 */