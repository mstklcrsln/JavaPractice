package bulutluoz.Arrays;

public class Array6 {
    public static void main(String[] args) {

        // create a method that can write the smallest and longest elements from an string array

        String [] arr= {"Maden", "cinayetinde", "yaralanan", "işçileri", "tane", "olarak", "ifade", "etmişti,", "bombalı", "saldırıda", "yaralananları da", "rakam" , "olarak", "andı..."};

        theLongestAndShortestElement(arr);
        //'yaralananları da' is the longest String
        //'tane" is the shortest String

    }
    public static void theLongestAndShortestElement (String [] arr){
        String longest= arr[0];
        String shortest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length()> longest.length()){
            longest= arr[i];
            }
            if (arr[i].length()< shortest.length()){
                shortest= arr[i];
            }
        }
        System.out.println("\'"+longest+ "\'"+ " is the longest String");
        System.out.println("\'"+ shortest+ "\" is the shortest String");
    }
}
