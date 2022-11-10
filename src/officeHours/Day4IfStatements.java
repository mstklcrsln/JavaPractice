package officeHours;

public class Day4IfStatements {
    public static void main(String[] args) {

        int num1 = 2;
        int num2 = 3;
        if (num1 > num2) {
            System.out.println(num1 + " is bigger");
        } else {
            System.out.println(num2 + " is bigger");
        }

        System.out.println("-------------");

        int amount = 990;

        if (amount >= 1000) {
            System.out.println("you can get discount");
        } else {
            System.out.println("there is no discount");

            System.out.println("--------------");
            int age = 2;
            if (age > 0 && age < 18) {
                if (age <= 2) {
                    System.out.println("You must stay at home");
                } else if (age <= 6) {
                    System.out.println("You can go kindergarten");
                } else {
                    System.out.println("primry school");
                }
            }
        }



    }

}
