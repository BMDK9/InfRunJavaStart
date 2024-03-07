package loop;

public class Question {

    public static void main(String[] args) {

        question1();
        question2();
        question3();
        question4();
        question5();
    }

    private static void question5() {
        System.out.println("question5");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void question4() {
        System.out.println("question4");

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " 곲하기 " + j + " = " + i * j);
            }
        }
        System.out.println();
    }

    private static void question3() {
        System.out.println("question3");
        int max = 100;
        int sum = 0;
        int i = 1;

        while (i <= max) {
            sum += i;
            i++;
        }
        System.out.println("sum = " + sum);

        sum = 0;
        for (int j = 1; j <= max; j++) {
            sum += j;
        }
        System.out.println("sum = " + sum);
        System.out.println();
    }

    private static void question2() {
        System.out.println("question2");
        int num = 0;

        while (true) {
            num++;

            if (num%2 == 0) {
                System.out.println("while num = " + num);
            }

            if (num == 20) {
                break;
            }
        }

        for (int i = 0; ; i++) {
            System.out.println("for num = " + (num = i * 2));

            if (num == 20) {
                break;
            }
        }

        for (int i = 2, count = 1; count <= 10; i += 2, count++) { // 비추천
            System.out.println("i = " + i);
        }
        System.out.println();
    }

    private static void question1() {
        System.out.println("question1");
        int count = 0;

        while (count < 10) {
            ++count;
            System.out.println("count = " + count);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count = i + 1);
        }
        System.out.println();
    }
}
