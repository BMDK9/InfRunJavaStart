package operator;

public class Operator1 {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("sum = " + sum);

        int diff = a - b;
        System.out.println("diff = " + diff);

        int multi = a * b;
        System.out.println("multi = " + multi);

        int div = a / b;
        System.out.println("div = " + div);

        double dicD = (double) a / b;
        System.out.println("dicD = " + dicD);

        int mod = a % b;
        System.out.println("mod = " + mod);

        // 연산자 우선 순위는 일반 수학과 같음
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
