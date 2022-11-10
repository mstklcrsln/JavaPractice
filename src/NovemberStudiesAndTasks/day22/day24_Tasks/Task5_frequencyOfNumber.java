package NovemberStudiesAndTasks.day22.day24_Tasks;

public class Task5_frequencyOfNumber {
    public static void main(String[] args) {

        int[] array ={1,1,1,1,1,1,1,1,1,1,1,2,2, 3};
        int number =1;
        int result= frequencyOfNumber(array,number);
        System.out.println("result = " + result);
    }
        public static int frequencyOfNumber (int [] array, int number){
        int count= 0;
            for (int each : array) {
                if (each==number){
                    count++;
                }
            }
            return count;
        }
}

/*
 5. create method that accepts one integer array and one integer number and returns the frequency of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
 */