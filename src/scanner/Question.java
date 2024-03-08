package scanner;

import java.util.Scanner;

public class Question {

    public static void main(String[] args) {

//        question1();
//        question2();
//        question3();
//        question4();
//        question5();
//        question6();
//        question7();
//        question8();
        question9();
    }

    private static void question9() {
        Scanner scanner = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int input = scanner.nextInt();

            if (input == 1) {
                System.out.print("상품명을 입력하세요 : ");
                scanner.nextLine();
                String name = scanner.nextLine();

                System.out.print("가격을 입력하세요 : ");
                int price = scanner.nextInt();

                System.out.print("수량을 입력하세요 : ");
                int count = scanner.nextInt();

                System.out.println("상품명 : " + name + " 가격 : " + price + " 수량 : " + count + " 비용 : "
                        + price * count);
                total += price * count;

            } else if (input == 2) {
                System.out.print("상품명을 입력하세요 : ");
                System.out.println("총 비용 : " + total);

            } else if (input == 3) {
                System.out.println("프로그램 종료");
                break;

            } else if (input < 0 || input > 3) {
                System.out.println("다시 입력해주세요");
            }
        }

    }

    private static void question9_variation(int input) {

    }

    private static void question8() {
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int count = 0;

        System.out.println("상품 가격을 입력하세요 (-1 입력 시 종료)");
        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }
        count = 1;
        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + avg);
    }

    private static void question7() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("상품 가격을 입력하세요 (-1 입력 시 종료) : ");
            int price = scanner.nextInt();
            if (price == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("상품 수량을 입력하세요 : ");
            int count = scanner.nextInt();

            System.out.println("총비용 : " + price * count);
        }
    }

    private static void question6() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료 입력 시 종료) : ");
            String name = scanner.nextLine();
            if (name.equals("종료")) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("이름 : " + name + " 나이 : " + age);
        }
    }


    private static void question5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해주세요 : ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력해주세요 : ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수 : ");
        for (int i = num1; i <= num2; i++) {
            System.out.print(i);
            if (i != num2) {
                System.out.print(", ");
            }
        }
    }

    private static void question4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("알고 싶은 구구단을 입력하세요 : ");
        int dan = scanner.nextInt();

        System.out.println(dan + "단");
        for (int i = 1; i <= 10; i++) {
            System.out.println(dan + " X " + i + " = " + dan * i);
        }
    }

    private static void question3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("음식의 이름을 입력해주세요 : ");
        String name = scanner.nextLine();

        System.out.print("음식의 가격을 입력해주세요 : ");
        int price = scanner.nextInt();

        System.out.print("음식의 수량을 입력해주세요 : ");
        int count = scanner.nextInt();

        System.out.println(name + " " + count + "개를 주문하셨습니다. 총 가격은 " + price * count + "원 입니다.");
    }

    private static void question2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int input = scanner.nextInt();

        if (input % 2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }
    }

    private static void question1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요 : ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }
}
