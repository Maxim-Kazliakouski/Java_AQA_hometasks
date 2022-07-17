package Lesson_10;

public class Palindrome {
    public static void main(String[] args) {
        searchPalindrome();
    }

    public static void searchPalindrome() {
        String text = ("Дима нашёл отличный довод увеличить свой доход").toLowerCase();
        String[] arrayText = text.split(" ");
        String[] reverseArray = new String[arrayText.length];
        for (int each_word = 0; each_word < arrayText.length; each_word++) {
            String reverseString = "";
            for (int i = 0; i < arrayText[each_word].length(); i++) {
                reverseString = arrayText[each_word].charAt(i) + reverseString;
                reverseArray[each_word] = reverseString;
            }
            if (reverseString.equals(arrayText[each_word])) {
                System.out.printf("The word '%s' --> is palindrome%n", arrayText[each_word]);
            }
        }
    }
}

//Написать метод, который находит и выводит все слова палиндромы в тексте.
