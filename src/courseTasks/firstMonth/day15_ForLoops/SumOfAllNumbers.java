package courseTasks.firstMonth.day15_ForLoops;

public class SumOfAllNumbers {
    public static void main(String[] args) {
        int result = 0;
        int num= 50;

        for (int i = 1; i <=num ; i++) {
            result +=i;
        }
        System.out.println(result);
    }
}
