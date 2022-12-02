package courseTasks.firstMonth.Day20_Tasks;

public class Task3_AverageNumber {
    public static void main(String[] args) {

        int [] numbers = {2,5,8,9,6,3,55,669,45,25,45};


        int sum= 0;

        for (int i = 0; i <numbers.length ; i++) {
            sum += numbers[i];
        }
        double average = sum/numbers.length;
        System.out.println("average = " + average);
    }
}
