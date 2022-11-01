package septemberStudiesAndHomeworks;

public class CrewAndPassangers {
    public static void main(String[] args) {

        int number =100;
        String result = "";
        boolean validnumber = number==50 || number==75|| number==100;

        if (validnumber){
            if (number==50) {
                result = "20 crew, 30 passengers";
            }if (number==75){
                result = "25 crew, 50 passengers";
            } else {
                result = "30 crew, 70 passengers";
            }

        } else  {
            result= "Invalid number";
        }

        System.out.println("result = " + result);
    }
}
/*
2. Create a class called CrewAndPassangers, Given a number of people on the ship (int number),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */