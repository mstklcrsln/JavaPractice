package officeHours.december.secondWeek;

import java.util.Arrays;

public class ArraysTask1 {

    public static void main(String[] args) {

       String [][] fruits = new String[3][]; // we created new array
        //to create some data of fruits
        String [] fruit= {"apple", "banana", "pear"};
        String [] price = {"10","20","30"};
        String [] count = {"100","200","300"};
        //we put the fruits in array
        fruits[0]= fruit;
        fruits[1]= price;
        fruits [2]= count;

        System.out.println(Arrays.deepToString(fruits)); //[[apple, banana, pear], [10, 20, 30], [100, 200, 300]]

        // we want to get elements
        for (int i = 0; i <3 ; i++) {
            String name = fruits[0][i]; //we want to get names from index zero element
            String price1 = fruits[1][i]; //we want to get names from index 1 element
            String count1 = fruits[2][i]; //we want to get names from index 2 element

            System.out.println(name+ " price is "+ price1 + " dollar, "+ count1 +" left");
            /*
            apple price is 10 dollar, 100 left
            banana price is 20 dollar, 200 left
            pear price is 30 dollar, 300 left
             */
        }

    }
}
/*
Create a 2d array of fruits, has fruits, fruits, price, count
print ==> apple price is 10 dollar, 100 left.
 */