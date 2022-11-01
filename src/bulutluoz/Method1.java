package bulutluoz;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Method1 {
    public static void main(String[] args) {

     String name= "mesut ";
     String lastName= "KİLİCARSLAN";

        System.out.println(nameAndLastName(name, lastName)); //Mesut Kilicarslan

        System.out.println(nameAndLastName("AHMET", "DDEİTT"));//Ahmet Ddeitt

    }
    public static String nameAndLastName (String name, String lastName) {
        String newName = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase()+ " "+
                                        lastName.substring(0,1).toUpperCase()+
                                        lastName.substring(1).toLowerCase();
        return newName;
    }
}
