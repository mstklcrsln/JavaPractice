package wiseJavaCourse.ArrayListStudies;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AveragePoint {
    public static void main(String[] args) {

        /*
        ask the teacher for his students points, when he enteres 0 program finished
        than write class student numbers, class average and how many people is above the class average
         */
    List <Double> notes = createList();
        System.out.println(notes);

        report (notes);
        /*
        [25.0, 35.0, 45.0, 55.0, 65.0, 75.0, 85.0, 95.0]
        entered note number 8
        Class average is 60.0
        Students over the class average is 4
         */
    }

    public static void report(List<Double> notes) {
        //write class student numbers, class average and how many people is above the class average

        int studentsNumber= notes.size();
        double addOfAllNotes= 0.0;
        double classNoteAverage =0.0;
        int studentsOverAverage= 0;
        //find the addOfAllNotes
        for (int i = 0; i <notes.size() ; i++) {
            addOfAllNotes += notes.get(i);
        }
        // find average
        classNoteAverage = addOfAllNotes/studentsNumber;

        //find  studentsOverAverage

        for (int i = 0; i < notes.size(); i++) {
            if (notes.get(i)>classNoteAverage){
                studentsOverAverage++;
            }
        }

        // write the report contents
        System.out.println("entered note number "+studentsNumber);
        System.out.println("Class average is "+ classNoteAverage);
        System.out.println("Students over the class average is "+ studentsOverAverage);

    }

    public static List<Double> createList() {
        List<Double> notes = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        Double enteredNote = (double) 5;

        while (enteredNote>0) {
            System.out.println("Please enter a note to add the list\nPress 0 for finish");
            enteredNote = scan.nextDouble();
            if (enteredNote > 0) {
                notes.add(enteredNote);
            }
        }
        return notes;
    }
}