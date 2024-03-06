package variable;

public class VarQuestion {

    public static void main(String[] args) {
        question1();
        question2();
        question3();

    }

    private static void question3() {
        long l = 10000000000L;
        boolean b = true;

        System.out.println("Question 3");
        System.out.println("l = " + l);
        System.out.println("b = " + b);
    }

    private static void question2() {
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;

        System.out.println("Question 2");
        System.out.println("sum = " + sum);
    }

    private static void question1() {
        int num1 = 4;
        int num2 = 3;

        System.out.println("Question 1");
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
    }
}
