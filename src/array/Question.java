package array;

import java.util.Scanner;

public class Question {

    static Scanner scanner;

    public static void main(String[] args) {
        question1();
        question2();
        question3();
    }

    private static void question3() {
        scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요 : ");
        int students = scanner.nextInt();
        int[][] scores = new int[students][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            for (int j = 0; j < scores[0].length; j++) {
                System.out.print(subjects[j] + " 점수 : ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < students; i++) {
            System.out.println((i + 1) + "번 학생");
            int total = 0;
            for (int j = 0; j < scores[0].length; j++) {
                System.out.println(subjects[j] + " : " + scores[i][j]);
                total += scores[i][j];
            }
            System.out.println("총점 : " + total + " 평균 : " + (total / scores[0].length));
        }
    }

    private static void question2() {
        System.out.print("몇 번 숫자를 입력하시겠습니까? ");
        scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int[] arrays = new int[time];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < time; i++) {
            int input = scanner.nextInt();
            arrays[i] = input;
            if (max < arrays[i]) {
                max = arrays[i];
            }
            if (min > arrays[i]) {
                min = arrays[i];
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

    private static void question1() {
        System.out.print("몇 번 숫자를 입력하시겠습니까? ");
        scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < time; i++) {
            int input = scanner.nextInt();
            sum += input;
        }

        if (time == 0) {
            time = 1;
        }
        avg = (double) sum / time;
        System.out.println("입력된 숫자의 합 : " + sum);
        System.out.println("입력된 숫자의 평균 : " + avg);

    }
}