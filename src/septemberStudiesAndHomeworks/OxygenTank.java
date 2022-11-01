package septemberStudiesAndHomeworks;

public class OxygenTank {
    public static void main(String[] args) {
        int level = 69;
        String tankSituation = "";

        if (level>=0&& level<=100) {
            if (level<=50) {
                tankSituation= "Be careful now you at 50%";
            } else if (level<=60){
                tankSituation = "Start to head back";}
                else if (level <=70) {
                    tankSituation = "Don't go too far";}
                    else if (level<=80) {
                        tankSituation = "Still okey";}
                    else {
                        tankSituation = "Your tank is full";
            }


        } else
            tankSituation = "Wrong input";

        System.out.println("tankSituation = " + tankSituation);

    }
}
