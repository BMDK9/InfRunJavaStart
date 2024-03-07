package loop;

public class Question {

    public static void main(String[] args) {

        question1();
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
