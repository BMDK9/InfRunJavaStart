package loop;

public class Question {

    public static void main(String[] args) {

        question1();
        question2();
    }

    private static void question2() {
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
    }

    private static void question1() {
        int count = 0;

        while (count < 10) {
            ++count;
            System.out.println("count = " + count);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(count = i + 1);
        }
    }
}
