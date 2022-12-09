package officeHours.december.secondWeek;

public class ArraysTask2 {

    public static void main(String[] args) {

        int [][] numbers= {{1,4,9,}, {11,4,3}, {2,2,3}};

       /* for (int i = 0; i <3 ; i++) {
            int count1 = numbers[0][i];
            int count2 = numbers[1][i];
            int count3 = numbers[2][i];
            System.out.println(count1+count2+count3); this is wrong
*/          int sum=0;
        for (int i = 0; i < 3; i++) { //this is for getting each array
            for (int j = 0; j < 3; j++) { //this is for getting each element from inner array
                sum += numbers[i][j];
            }
        }
        System.out.println(sum);  //39
    }
}
        /*
        int [][] table = {{1,24,9,}, {11,4,3}, {2,2,3}}
        get sum of these nubers
         */
