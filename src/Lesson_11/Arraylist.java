package Lesson_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        int listSize = 5;
        for (int i = 0; i < listSize; i++){
            list.add(random.nextInt(10));
        }
        System.out.println("Adding new value '10' in the end of the list");
        list.add(10);
        System.out.println(list);
        System.out.printf("Getting the 3rd element: %s%n", list.get(3));
        System.out.printf("Getting size of the list: %s%n", list.size());
        System.out.println("Is the list contains value '4' --> " + list.contains(4));
        System.out.println("Removing value by index:");
        list.remove(3);
        System.out.println("The list without 3rd element --> " + list.get(3));
        System.out.println(list);
        System.out.println("Is the list is empty --> " + list.isEmpty());
    }
}
