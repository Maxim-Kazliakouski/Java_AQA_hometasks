package Lesson_10;

public class ShortestWord {
    public static void main(String[] args) {
        System.out.printf("The less word --> %s%n", searchLessWord());
    }

    public static String searchLessWord() {
        String text = ("Only some photograph on the mantelpiece really showed how much time had passed").toLowerCase();
        String[] arrayText = text.split(" ");
        String minWord = arrayText[0];
        for (int eachWord = 1; eachWord < arrayText.length; eachWord++) {
            if (minWord.length() > arrayText[eachWord].length()) {
                minWord = arrayText[eachWord];
            }
        }
        return minWord;
    }
}

//    Написать метод, который возвращает самое маленькое слово в тексте.
