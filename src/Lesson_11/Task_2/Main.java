package Lesson_11.Task_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // creating students
        Students student1 = new Students(20, "Max", Students.generateMarks());
        Students student2 = new Students(19, "Alex", Students.generateMarks());
        Students student3 = new Students(21, "Nick", Students.generateMarks());
        Students student4 = new Students(22, "Conor", Students.generateMarks());
        // list of students for BNTU university
        ArrayList<String> firstUniversity = Students.addingStudentsToTheList(student1, student2);
        // list of students for MGLU university
        ArrayList<String> secondUniversity = Students.addingStudentsToTheList(student3, student4);
        // Rank of BNTU university:
        double rank1 = Students.avgMarks(student1.getMarksList(), student2.getMarksList());
        // Rank of MGLU university:
        double rank2 = Students.avgMarks(student3.getMarksList(), student4.getMarksList());
        // creating university
        University university1 = new University("BNTU", firstUniversity, rank1);
        University university2 = new University("MGLU", secondUniversity, rank2);
        System.out.printf("Rank for %s is --> %s%n", university1.getNameOfUniversity(), university1.getRating());
        System.out.printf("Rank for %s is --> %s%n", university2.getNameOfUniversity(), university2.getRating());
    }
}
