package loop;

public class For1 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 0; i < endNum; i++) {
            sum += i;
            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
        }

        for (; ; ) { // 무한 반복문
            if (sum > 6) {
                break;
            }
            System.out.println("무한 반복문");
            sum++;
        }
    }
}
