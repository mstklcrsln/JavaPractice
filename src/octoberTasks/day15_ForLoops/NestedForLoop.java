package octoberTasks.day15_ForLoops;

public class NestedForLoop {
    public static void main(String[] args) {

        for (int i = 0; i <4 ; i++) {
            for (int j = i; j <4 ; j++) {
                System.out.print("* ");
                /*
                 * * * *
                 * * *
                 * *
                 *
                 */
            }
            System.out.println("");
        }
        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + " ");
                /*
                1
                1 2
                1 2 3
                1 2 3 4
                1 2 3 4 5
                 */
            }
            System.out.println("");
        }
/*
        1
        2   4
        3   6   9
        4   8   12  16
        5   10  15  20  25
 */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i*j+ " ");
                /*
                1
                2 4
                3 6 9
                4 8 12 16
                5 10 15 20 25
                 */
            }
            System.out.println("");
        }
    }
}
