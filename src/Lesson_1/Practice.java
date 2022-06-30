package Lesson_1;

public class Practice {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 17;
        double d = 16;
        double e = 20;
        double Result1 = ((a + (a * a / a)) / (b + (b * b / b))) + (c * c * c) / ((b + d) * e);
        System.out.println("The 1st result: ");
        System.out.printf("%.3f", Result1);
        double f = 1;
        double g = 1000;
        double SingleExpression = (c * c * c + b * b * b);
        double Result2 = (f / f / c) / Math.pow(SingleExpression, 4) * (g / f / c);
        System.out.println();
        System.out.println("The 2nd result: ");
        System.out.println(Result2);
    }
}
