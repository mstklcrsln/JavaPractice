package novemberTasks.day27_Tasks;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {

        int [] array= {10, 20, 30, 40, 50};

       int [] newArray = threeInt(array, 2, 100);
        System.out.println(Arrays.toString(newArray)); //[10, 20, 100, 30, 40, 50]

        System.out.println("-------------------------");
        double [] array2 ={10,20,30,40,50,55};
        double [] newArray2 = threeDouble(array2,1,9965); //[10.0, 9965.0, 20.0, 30.0, 40.0, 50.0, 55.0]
        System.out.println(Arrays.toString(newArray2));

        System.out.println("-----------------------------");

        char [] array3 = {'a','s','d','f','g','h','h','j','j','i'};
        char [] newArray3= threeChar(array3,2,'q');
        System.out.println(Arrays.toString(newArray3)); //[a, s, q, d, f, g, h, h, j, j, i]

        System.out.println("-----------------------------");

        String [] array4 ={"Mesut", "Veli", "ahmet", "Osman", "Fatma"};
        String [] newArray4 = threeString(array4, 0,"Woden Spoon");
        System.out.println(Arrays.toString(newArray4)); //[Woden Spoon, Mesut, Veli, ahmet, Osman, Fatma]

    }
    public static int []  threeInt (int [] array, int index, int element) {
        if (index<0  || index>array.length- 1){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        int [] newArray = new int[array.length+1];
        newArray [index]= element;
        for (int i = 0, k=0; i <array.length ; i++, k++) {
            if (i== index){
                k++;
            }
            newArray[k]= array[i];
        }
        return newArray;
    }

    public static double [] threeDouble (double [] array2, int index2, double newElement2){
        if (index2<0 || index2>array2.length-1){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        double [] newArray2= new double[array2.length+1];
        newArray2[index2]=newElement2;
        for (int i = 0, k=0; i <array2.length ; i++, k++) {
            if (i==index2){
                k++;
            }
            newArray2[k]= array2 [i];
        }
        return newArray2;
    }

    public static char [] threeChar (char [] array3, int index3, char newElement3){
        if (index3<0 || index3> array3.length-1) {
            System.out.println("Invalid entry");
            System.exit(0);
        }
        char [] newArray3 = new char[array3.length+1];
        newArray3 [index3]= newElement3;

        for (int i = 0,k=0; i < array3.length ; i++, k++) {
            if (i==index3){
                k++;
            }
            newArray3 [k]= array3 [i];
        }
        return newArray3;
    }

    public static String [] threeString (String [] array4, int index4, String newElement4) {
        if (index4<0 || index4> array4.length){
            System.out.println("Invalid entry");
            System.exit(0);
        }
        String [] newArray4 = new String[array4.length+1];
        newArray4 [index4]= newElement4;

        for (int i = 0, k=0; i <array4.length ; i++, k++) {
            if (index4==i){
                k++;
            }
            newArray4 [k]= array4[i];
        }
        return newArray4;
    }


}

/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
2.2 Create the same function for double array, char array and string array
 */