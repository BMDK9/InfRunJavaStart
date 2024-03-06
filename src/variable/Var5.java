package variable;

public class Var5 {

    public static void main(String[] args) {
        // 정수
        byte b = 127; // -128 ~ 127, 파일 전송 외에는 사용 안함
        short s = 32767; // -32768 ~ 32767, 사용 안함

        int i = 2147483647; // 대충 21억 -2147483648 ~ 2147483647
        long l = 9223372036854775807L;

        // 실수
        float f = 10.0f; // 사용 안함
        double d = 10.0; // float 보다 큼, 정밀도 더 좋음/ default
    }
}
