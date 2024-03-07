package casting;

public class Casting2 {

    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        // int < long < double
        // 묵시적 형변환

        longValue = (long) intValue;
        doubleValue = (double) longValue;

        System.out.println("intValue = " + intValue);
        System.out.println("longValue = " + longValue);
        System.out.println("doubleValue = " + doubleValue);

        // 큰 내용을 작은 그릇에 넣는 것이라 값이 잘리는 경우 발생
        // double 를 long, int 에 넣으면 소수점 짤림

        longValue = (long) doubleValue;
        intValue = (int)longValue;
        System.out.println();
        System.out.println("큰 것을 작은 그릇으로");
        System.out.println("doubleValue = " + doubleValue);
        System.out.println("longValue = " + longValue);
        System.out.println("intValue = " + intValue);

        long maxInt = 2147483647;
        long maxIntOver = maxInt + 1;
        System.out.println();
        intValue = (int) maxInt;
        System.out.println("오버 플로우");
        System.out.println("intValue = (int) maxInt => " + intValue);
        intValue = (int) maxIntOver;
        System.out.println("intValue = (int) maxIntOver => " + intValue);
    }
}
