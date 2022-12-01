package replitTasks.December;

import java.util.Scanner;

public class Party {

    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        Scanner input = new Scanner(System.in);

        //WRITE YOUR CODE BELOW
        String guestList= "";
        String name= "";
        String answer="";
        do {
            System.out.println("Please enter the guest's name:");
            name = input.next();
            guestList +=  name;
            System.out.println("Do you want to enter another guest's name? Yes/No");
            answer = input.next();
                if (answer.equalsIgnoreCase("yes")){
                    guestList += ", ";
                }
        }while (answer.equalsIgnoreCase("yes"));
        System.out.println("Guests' list: " + guestList);
    }
}
/*
### Use a `loop` to create a guest list for the party.
Ask the user to enter the name of the first guest, store the name into the guest list and ask if they want to enter another guest name.
> - If the user says `yes` then ask them for the next guest's name and repeat the process
> - If the user says `no` then stop asking for names and display the final guest list
Main topics: loops, Scanner, Strings, concatenation
Example Flows:
```
Please enter the guest's name:
  Nick
Do you want to enter another guest's name?
  yes
Please enter the guest's name:
  Linda
Do you want to enter another guest's name?
  no
Guests' list: Nick, Linda
```
 */