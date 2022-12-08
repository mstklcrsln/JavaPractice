package courseTasks.thirdMonth.day35Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {

        Candy candy1= new Candy("Chocolate", 1,2,true);
        Candy candy2= new Candy("Delicious", 2,3,false);
        Candy candy3= new Candy("Ulker", 3, 4, false);
        Candy candy4= new Candy("Eti", 4,5 ,false);
        Candy candy5= new Candy("Candy", 2,8,true);

        ArrayList<Candy> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy: candies){
            System.out.println(candy.getBrand()+ " : "+ candy.getPrice());
            /*
             Chocolate : 2.0
            Delicious : 3.0
            Ulker : 4.0
            Eti : 5.0
            Candy : 8.0
             */

        }
    }
}

/*
1.2 Create a class named CandyFactory
                Create an ArrayList of candies
                Add five objects of candies
                use for each loop to print the brand and price of each candy
 */