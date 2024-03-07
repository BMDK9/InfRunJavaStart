package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작

        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("m = " + m); // 내부에서 외부 접근 가능
            System.out.println("x = " + x);
        } // x 생존 종료
        // x 접근 불가 = 외부에서 내부 접근 불가
        System.out.println("m = " + m);
    }// m 생존 종료
}
