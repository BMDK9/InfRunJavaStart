package operator;

public class OperatorAdd1 {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a = a + 1;
        System.out.println("a = " + a); // 1
        System.out.println();

        a += 1;
        System.out.println("a = " + a); // 2
        System.out.println();

        b = ++a; // a 사용 전에 a = a + 1;
        System.out.println("b = " + b); // b = 3
        System.out.println("a = " + a); // a = 3
        System.out.println();

        b = a++; // a를 사용한 다음 a = a + 1
        System.out.println("b = " + b); // b = 3
        System.out.println("a = " + a); // a = 4
        System.out.println();

        a /= 2; // 모든 연산 가능
        System.out.println("a = " + a); // 2
    }
}
