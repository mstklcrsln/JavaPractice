package NovemberStudiesAndTasks.day22;

public class EachelementOfArray {
    public static void main(String[] args) {
        int [] array= {5,89,63,54,25};
        eachElement(array);


    }
    public static void  eachElement (int [] array) {
        for (int each: array
             ) {
            System.out.print(each+ " ");

        }
    }
}
