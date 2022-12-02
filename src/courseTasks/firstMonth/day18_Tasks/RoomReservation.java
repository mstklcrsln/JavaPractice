package courseTasks.firstMonth.day18_Tasks;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);

        int price = 0;
    while (true){
     System.out.println("which bedroom d you want to reserve? These are room types: \nKing Bed ==> 120$\nQueen Bed ==> 100$\nSingle Bed ==> 80$");
       String room = scan.nextLine().toLowerCase();

       System.out.println("how many nights will you stay?");
       int day = scan.nextInt();

        if (room.equals("king bed")) {
            price = (day*120);
        } else if (room.equals("queen bed")) {
            price = (day*100);
        } else {
            price = (day*80);
        }
        System.out.println("your price is: " + price);


        System.out.println("Would you like to reserve another room? yes/no");
       String  ans = scan.next().toLowerCase();
       scan.nextLine();

        while(!(ans.equalsIgnoreCase("yes") ||ans.equalsIgnoreCase("no"))){
            System.out.println("Invalid answer, please re-enter. Would you like to reserve another room?");
            ans= scan.next();
        }
        if (ans.equals("no")) {
            System.out.println("Your price is: " + price);
           System.exit(0);
        }
    }
    }
}


/*

2. Create a class called RoomReservation, write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            Single Bed ==> 80$

            the program asks the user which bedroom does he/she wants to reserve, and how many nights he/she is staying.
            Then Ask the user "would you like to reserve another room?""
                            if yes ==> repeat the entire steps
                            if no ==> return the  total price

            	If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
 */