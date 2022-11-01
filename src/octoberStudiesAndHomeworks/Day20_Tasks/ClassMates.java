package octoberStudiesAndHomeworks.Day20_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClassMates {
    public static void main(String[] args) {
        String classmates [] = {"Oğuz Kürşat Özkan","Özgür Ciritbeyi","Akile Altın","Kerime Ünal","Enes Zengin","Ferhat Alvar","Emre Karakuş","Necdet Emir Güngör","Canan Bilge Evrim","Muhammet Gokhan Guner"};
        //String [] classmates ={"Surhay Ceylan", "Vahap İren", "Zulal Kutluer", "Bedriye Şahin", "Veli Kara", "Erfan Zaayer", "Eren Çiftçi", "Ebru Göktaş", "Selami Güngördü", "Esra Dindar"};

       // System.out.println(Arrays.toString(classmates));
        String initials = "";

        for (int i = 0; i < classmates.length; i++) {
            char ch= classmates [i].charAt(0);
            int indexNo= classmates[i]. indexOf(" ");
            int lastIndexNo=  classmates[i].lastIndexOf(" ");
            if (indexNo != lastIndexNo) {
                initials+= ""+ ch+ classmates[i].charAt(indexNo+1)+ classmates[i].charAt(lastIndexNo+1)+ ", ";
            }else {
                initials+= "" +ch+classmates[i].charAt(lastIndexNo+1)+ ", ";
            }

        } System.out.println(initials);

        System.out.println(initials.substring(0,initials.length()-2));
    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */