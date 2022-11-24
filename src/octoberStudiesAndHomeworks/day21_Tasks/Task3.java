package octoberStudiesAndHomeworks.day21_Tasks;

public class Task3 {

    public static void main(String[] args) {
      int [] num1 = {1,2,3,4,5};
        int [] num2= {4,5,6,7,8};
        String common="";

        for (int each1: num1) {
            for (int each2 : num2) {

                if (each1==each2) {
                    common += each2+ " ";
                }
            }
        }
        System.out.print("common numbers= " + common);
    }
}
/*
3. Write a program that can print out the common elements from two integer array

              4 5
          MUST use for each loops

 */