package Lesson_10;

public class Search {
    public static void main(String[] args) {
        System.out.println("The words with length from 3 to 5: ");
        System.out.println("-----------------------------------");
        searchCertainWord();
    }

    public static void searchCertainWord() {
        String text = ("Only some photographs on the mantelpiece really showed how much time had passed").toLowerCase();
        String[] arrayText = text.split(" ");
        int amountOfWords = 0;
        for (int eachWord = 0; eachWord < arrayText.length; eachWord++) {
            if (arrayText[eachWord].length() >= 3 && arrayText[eachWord].length() <= 5) {
                amountOfWords++;
            }
        }
        String[] arrayCertainWords = new String[amountOfWords];
        for (int i = 0, k = 0; i < arrayText.length; i++) {
            if (arrayText[i].length() >= 3 && arrayText[i].length() <= 5) {
                arrayCertainWords[k] = arrayText[i];
                k++;
                System.out.println(arrayText[i]);
            }
        }
    }
}

//Написать метод, который находит и выводит все слова, длина которых от 3 до 5 включительно.