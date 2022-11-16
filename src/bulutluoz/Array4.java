package bulutluoz;

public class Array4 {
    public static void main(String[] args) {

        //find the freq of the given element from array and write it
        int [] arr = {1,2,3,4,5,6,7,8,8,9,9,6,2,4,5,1,2,5,4,2,5,5,5,20};
        int element=2;

        freqOfAnElement(arr,5); //There is 6 piece 5 is in this array

    }
    public static void freqOfAnElement (int [] array, int element){
        int count= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==element){
                count++;
            }
        }
       if (count==0){
           System.out.println("There is no " + element);
       }else {
           System.out.println("There is "+  count +" piece " + element+ " is in this array");
       }
    }
}
