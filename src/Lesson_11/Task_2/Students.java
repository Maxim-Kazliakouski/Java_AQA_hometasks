package Lesson_11.Task_2;

import java.util.ArrayList;
import java.util.Random;

public class Students {
    private int age;
    private String name;
    private ArrayList<Integer> marksList;

    public Students(int age, String name, ArrayList<Integer> marksList) {
        this.age = age;
        this.name = name;
        this.marksList = marksList;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarksList(ArrayList<Integer> marksList) {
        this.marksList = marksList;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getMarksList() {
        return marksList;
    }

        public static double avgMarks(ArrayList<Integer> marks1, ArrayList<Integer> marks2) {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < marks1.size(); i++) {
            sum1 += marks1.get(i);
        }
        for (int i = 0; i < marks2.size(); i++) {
            sum2 += marks2.get(i);
        }
        double result = ((sum1/marks1.size()) + (sum2/marks2.size()))/2.0;
        String newAround = String.format("%.2f", result);
        String replaceComma = newAround.replace(",", ".");
        return Double.parseDouble(replaceComma);
    }
    public static ArrayList<Integer> generateMarks() {
        Random random = new Random();
        ArrayList<Integer> marksList = new ArrayList<>();
        int listSize = 5;
        for (int i = 0; i < listSize; i++) {
            marksList.add(random.nextInt(1, 10));
        }
        return marksList;
    }

    public static ArrayList<String> addingStudentsToTheList(Students student1, Students student2) {
        ArrayList<String> studentsFirstUniversity = new ArrayList<>();
        studentsFirstUniversity.add(student1.getName());
        studentsFirstUniversity.add(student2.getName());
        return studentsFirstUniversity;
    }
}
