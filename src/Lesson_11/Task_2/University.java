package Lesson_11.Task_2;

import java.util.ArrayList;

public class University {
    private String nameOfUniversity;
    private ArrayList<String> listOfStudents;
    private double rating;

    public University(String nameOfUniversity, ArrayList<String> listOfStudents, double rating) {
        this.nameOfUniversity = nameOfUniversity;
        this.listOfStudents = listOfStudents;
        this.rating = rating;
    }

    public void setNameOfUniversity(String nameOfUniversity) {
        this.nameOfUniversity = nameOfUniversity;
    }

    public void setListOfStudents(ArrayList<String> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public ArrayList<String> getListOfStudents() {
        return listOfStudents;
    }

    public double getRating() {
        return rating;
    }
}
