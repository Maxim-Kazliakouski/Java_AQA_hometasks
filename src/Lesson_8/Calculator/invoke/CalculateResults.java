package Lesson_8.Calculator.invoke;

import Lesson_8.Calculator.DataBase;

public class CalculateResults extends OperationsMenu implements DataBase {
    @Override
    public void printHistory() {
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

    private void descriptionAllHistory() {
        System.out.println("-----------------------");
        System.out.println("All results: ");
        System.out.println("-----------------------");
    }

    private void descriptionNoResults() {
        System.out.println("--------------------------");
        System.out.println("There are no results yet...");
    }

    @Override
    public void printAllHistory() {
        if (allResults.size() == 0) {
            descriptionNoResults();
        } else {
            descriptionAllHistory();
            for (int i = 0; i < allResults.size(); i++) {
                System.out.println(allResults.get(i));
            }
        }
    }

    @Override
    public void recordToAllHistory(double result, String typeOfOperation) {
    }

    @Override
    public void recordHistory(double result, String typeOfOperation) {
    }
}

