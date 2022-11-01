package septemberStudiesAndHomeworks;

public class AgeGroups {
    public static void main(String[] args) {
        int age = 151;
        String result = "";

        if (age<=150 && age>0) {
             if (age<21 && age>0){
            result ="Teenager";}
            else if (age>=21 && age<=55) {
                 result = "Adult";
             } else {
                    result= "Senior";
                }
        } else {
           result= "Wrong input";}
        System.out.println("result = " + result);


    }
}
