package Lesson_10;

public class Append {
    public static void main(String[] args) {
        StringBuilder string1 = new StringBuilder();
        System.out.println(string1.append("3 + ").append("56 = ").append("59"));
        StringBuilder string2 = new StringBuilder();
        System.out.println(string2.append("3 * ").append("56 = ").append("168"));
    }
}
//    Используя StringBuilder сделайте выражения 3 + 56 = 59
//        3 – 56 = -53
//        3 * 56 = 168.
//        Использовать метод append() несколько раз
