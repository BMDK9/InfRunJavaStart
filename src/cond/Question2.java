package cond;

public class Question2 {

    public static void main(String[] args) {
        question3();
        question4();
        question5();
        question6();
    }

    private static void question6() {
        int x = 7;
        if (x % 2 == 0) {
            System.out.println("x는 짝수입니다.");
        } else {
            System.out.println("x는 홀수입니다.");
        }
    }

    private static void question5() {
        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b;
        System.out.println("max = " + max);
    }

    private static void question4() {
        char grade = 'B';
        switch (grade) {
            case 'A' -> System.out.println("탁월한 성과입니다.");
            case 'B' -> System.out.println("좋은 성과입니다.");
            case 'C' -> System.out.println("준수한 성과입니다.");
            case 'D' -> System.out.println("향상이 필요합니다.");
            case 'F' -> System.out.println("불합격입니다.");
            default -> System.out.println("잘못된 학점입니다.");
        }
    }

    private static void question3() {
        double rating = 7.1;

        if (rating <= 9) {
            System.out.println("어바웃타임");
        }
        if (rating <= 8) {
            System.out.println("토이스토리");
        }
        if (rating <= 7) {
            System.out.println("고질라");
        }
    }
}
