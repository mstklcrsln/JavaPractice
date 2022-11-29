package officeHours;

public class WhileLoopPractice {
    public static void main(String[] args) {

        one(); //6
        two(); //2 4 6 8 10
        System.out.println();
        three(); //5 10 15 20 25 30 35 40 45
    }

    public static void one() {
        int count = 1;
        while (count <= 10) {
            count *= 2;
        }
        count = count - 10;
        System.out.println("count = " + count);
        /*
         loop          count
         1              2   after this loop count become 2
         2              4   after this loop count become 4
         3              8   after this loop count become 8
         4              16  after this loop count become 16 and while loop finished

         16-10=6 our result
         */
    }

    public static void two() {
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.print(" " + i);
                i++;

        } while (i < 11) ;
    }

    public static void three (){
        for (int i = 1; i < 50; i++) {
            if (i %5 !=0){
                continue;
            }
            System.out.print(" " +i);
        }
    }



}
