package operator;

public class Operator2 {

    public static void main(String[] args) {

        String result1 = "hello" + "world";
        System.out.println("result1 = " + result1);

        String s1 = "String1";
        String s2 = "String2";
        String result2 = s1 + s2;
        System.out.println("result2 = " + result2);

        // 문자열과 다른 타입을 더할 때는 다른 타입을 자바가 문자열로 변경
        String result3 = "a + b = " + 10;
        System.out.println("result3 = " + result3);

        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println("result4 = " + result4);
    }
}
