package courseTasks.firstMonth.day15_ForLoops;

public class FactorialNumber {
    public static void main(String[] args) {
        int num =5;
        int result = 1;

        for (int i =1; i <=num ; i++) {
            result=i*result;
        }

        System.out.println(result);
    }
}
