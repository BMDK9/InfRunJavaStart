package cond;

import java.util.Arrays;

public class condOp1 {

    public static void main(String[] args) {
        int age = 10;
        String status1;

        // if 문
        if (age >= 18) {
            status1 = "성인";
        } else {
            status1 = "미성년자";
        }
        System.out.println("age = " + age + " status1 = " + status1);
        System.out.println();

        // 삼항 연산자
        String status2 = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status2 = " + status2);
    }
}
