package Lesson_8.Calculator;

import java.util.ArrayList;
import java.util.List;

public interface DataBase {
    // creating array for results and set the array's length
    String[] resultsCalculate = new String[3];
    List<String> allResults = new ArrayList<>();
    void recordHistory(double result, String typeOfOperation);
    void printHistory();
    void recordToAllHistory(double result, String typeOfOperation);
    void printAllHistory();
}
