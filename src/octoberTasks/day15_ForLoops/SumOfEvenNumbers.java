package octoberTasks.day15_ForLoops;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 0; i <=10 ; i++) {

            if (i%2==0) {
                result +=i;
            }
        }
        System.out.println(result);
    }
}
