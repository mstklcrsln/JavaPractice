package courseTasks.firstMonth.Day20_Tasks;

public class ReverseClassMates {
    public static void main(String[] args) {

        String classmates [] = {"Oğuz Kürşat Özkan","Özgür Ciritbeyi","Akile Altın","Kerime Ünal","Enes Zengin","Ferhat Alvar","Emre Karakuş","Necdet Emir Güngör","Canan Bilge Evrim","Muhammet Gokhan Guner"};

        for (String  each : classmates) {

            String reversed ="";
            for (int i = each.length()-1; i >=0 ; i--) {
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
        }
    }
}
/*
 for (String each : words ) { // each represents every single name Gunay Demir", "Anna Kesut ", "Zuhal mete "....

            String reversed = "";

            for (int i = each.length()-1; i >=0 ; i--) { // westarted from last character
                reversed += each.charAt(i);
            }
            System.out.println(reversed);
            }
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */