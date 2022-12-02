package courseTasks.firstMonth.day21_Tasks;

public class Task2 {
    public static void main(String[] args) {


        int [] numbers= {2,5,9,63,4,78,1,9,3, 5,22,86,54,29};
        int evenNumbers= 0;
        int oddNumbers= 0;

        for (int each: numbers) {
            if (each %2==0){
                evenNumbers++;
            }else {
                oddNumbers++;
            }
        }
        System.out.println("Even numbers :"+ evenNumbers+ " and  odd numbers "+ oddNumbers);
    }
}
