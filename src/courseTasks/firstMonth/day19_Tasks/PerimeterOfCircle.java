package courseTasks.firstMonth.day19_Tasks;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
    while (true){
        System.out.println("Enter the radius of the circle");
        double radius= scan.nextDouble();

        while (radius<1){
            System.err.println("Invalid Entry for the radius of the circle");
            radius= scan.nextDouble();
        }
        double diameter = 2*radius;
        double area= 3.14*radius*radius;
        double perimeter= 2*3.14*radius;

        System.out.println("diameter is: "+ diameter);
        System.out.println("area is: "+ area);
        System.out.println("perimeter is: "+ perimeter);

        System.out.println("Would you like to calculate another circle? yer/no");
        String answer= scan.next().toLowerCase();
        while ( ! (answer.equals("yes") || answer.equals("no")) ) {
            System.err.println("\"Invalid entry, please re-enter!\"");
            answer= scan.next();

        if (answer.equals("no")) {
            System.out.println("Thank you for using Cydeo Circle Calculator APP");
            break;}
        }}
    }
}

/*
1. Write a program that can calculate the area and perimeter of a circle:
			1. Ask the user "Enter the radius of the circle:"
				if user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the radius of the circle"

			2. Display:
					1. Diameter of circle
					2. Area of circle
					3. Perimeter of circle

			3. Ask the user "Would you like to calculate another circle?"
					If "yes" --> repeat the previous steps
					If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

				If user enters an invalid entry, ask the user to re-enter until user provides a valid entry
 */
