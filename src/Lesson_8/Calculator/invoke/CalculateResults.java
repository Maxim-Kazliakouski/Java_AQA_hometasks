package Lesson_8.Calculator.invoke;

public class CalculateResults extends OperationsMenu {
    public void invokeResults() {
        if (resultsCalculate[0] == null) {
            descriptionNoResults();
        } else {
            descriptionLastThreeResults();
            for (int i = 0; i < resultsCalculate.length; i++) {
                System.out.println(resultsCalculate[i] + " ");
            }
        }
    }

    private void descriptionLastThreeResults() {
        System.out.println("-----------------------");
        System.out.println("The last 3 results: ");
        System.out.println("-----------------------");
    }

    private void descriptionNoResults() {
        System.out.println("--------------------------");
        System.out.println("There are no results yet...");
    }
}
