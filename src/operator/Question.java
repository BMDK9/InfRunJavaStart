package operator;

public class Question {

    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }

    private static void question3() {
        int score = 80;
        boolean result = 80 <= score && score <= 100;
        System.out.println();
        System.out.println("question3");
        System.out.println(result);
    }

    private static void question2() {
        double d1 = 1.5;
        double d2 = 2.5;
        double d3 = 3.5;

        double sum = d1 + d2 + d3;
        double avg = sum / 3;

        System.out.println();
        System.out.println("question2");
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }

    private static void question1() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int sum = num1 + num2 + num3;
        int avg = sum / 3;

        System.out.println();
        System.out.println("question1");
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
