package officeHours;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println("-------------");
            for (int j = 1; j <5 ; j++) {
                System.out.println(" this is from second loop");
            }
            /*
            -------------
 this is from second loop
 this is from second loop
 this is from second loop
 this is from second loop
-------------
 this is from second loop
 this is from second loop
 this is from second loop
 this is from second loop
-------------
 this is from second loop
 this is from second loop
 this is from second loop
 this is from second loop
-------------
 this is from second loop
 this is from second loop
 this is from second loop
 this is from second loop
             */
        }
    }
}
