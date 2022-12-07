package officeHours.december;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {  //i and j have relation, j should be smaller than i, we related j with i
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*
1
22
333
4444
55555
 */
