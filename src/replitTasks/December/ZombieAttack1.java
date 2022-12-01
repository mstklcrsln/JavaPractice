package replitTasks.December;

public class ZombieAttack1 {
    public static void main(String[] args) {

        int num= 15;
        int day=0;

        while (num>0){
            num= num/2;
            //System.out.print(num); 7310
            System.out.println("Day "+ day+ " ["+ num + "]");
            day++;
        }
        /*
        Day 0[7]
        Day 1[3]
        Day 2[1]
        Day 3[0]
         */
    }
}
