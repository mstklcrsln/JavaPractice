package replitTasks.year_2023;

import java.util.Scanner;

public class GetSandwich {
    public static void main(String[] args) {
        /*
        breadjambread --> jam
        xxbreadjambreadxx --> jam
        xxbreadapple --> nothing
        breadbutterbread --> butter
         */

        Scanner scan= new Scanner(System.in);
        String str= scan.next();

        // first, make sure that we have at least 2 bread

        if (str.contains("bread")){
            int firstIndex= str.indexOf("bread");
            int lastIndex= str.lastIndexOf("bread");
            if(firstIndex== lastIndex){
                System.out.println("nothing");
            }else {
                // it means at least two bread
                System.out.println(str.substring(firstIndex+5, lastIndex));
            }
        } else {
            System.out.println("nothing");
        }
    }
}
