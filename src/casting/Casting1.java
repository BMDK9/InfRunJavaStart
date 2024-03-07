package casting;

public class Casting1 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // int < long < double
        // 자동 형변환
        // 작은 타입을 큰 타입으로 OK, 큰 타입을 작은 타입으로 NO(명시적 형변환 필요)

        longValue = intValue;
        doubleValue = longValue;

        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

//        longValue = doubleValue; // 안됨
//        intValue = longValue;  // 안됨
    }
}
