package cond;

public class Question1 {

    public static void main(String[] args) {

        question1();
        System.out.println();
        question2();
        System.out.println();
        question3();
    }

    private static void question3() {
        int hwan = 1300;
        int dollar = 5;
        if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else if (dollar > 0) {
            System.out.println("환전할 금액은 " + (hwan * dollar) + "원 입니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }

    private static void question2() {
        int distance = 7;
        if (distance <= 1) {
            System.out.println("도보");
        } else if (distance <= 10) {
            System.out.println("자동차");
        } else if (distance <= 100) {
            System.out.println("비행기");
        } else {
            System.out.println("비행기");
        }
    }

    private static void question1() {
        int score = 95;
        if (score >= 90) {
            System.out.println("학접은 A 입니다.");
        } else if (score >= 80) {
            System.out.println("학접은 B 입니다.");
        } else if (score >= 70) {
            System.out.println("학접은 C 입니다.");
        } else if (score >= 60) {
            System.out.println("학접은 D 입니다.");
        } else {
            System.out.println("학점은 F 입니다.");
        }
    }
}
