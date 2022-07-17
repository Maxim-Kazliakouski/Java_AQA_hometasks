package Lesson_10;

public class LongestWord {
    public static void main(String[] args) {
        System.out.printf("The biggest word --> %s%n", searchBigWord());
    }

    public static String searchBigWord() {
        String text = ("Only some photograph on the mantelpiece really showed how much time had passed").toLowerCase();
        String[] arrayText = text.split(" ");
        String maxWord = arrayText[0];
        for (int eachWord = 1; eachWord < arrayText.length; eachWord++) {
            if (maxWord.length() < arrayText[eachWord].length()) {
                maxWord = arrayText[eachWord];
            }
        }
        return maxWord;
    }
}

//    Написать метод, который возвращает самое большое слово в тексте.