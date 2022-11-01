package septemberStudiesAndHomeworks;

public class Elevator {
    public static void main(String[] args) {
        int floorNumber = 22;
        String output = "";

       if (floorNumber==1 || floorNumber==2|| floorNumber==3) {

           if (floorNumber == 1) {
            output = "Floor 1 selected. Companies: Lobby, Verizon, Starbucks";
        } else if (floorNumber == 2) {
            output = "Floor 2 selected. Companies: Cybertek, NASA, Intelsat";
        } else {
            output = "Floor 3 selected. Companies: Lyft, BofA, Stake house";
        }
    }
    else {
            output= "Invalid floor " + floorNumber;
        }

        System.out.println(output);
    }}

