package operator;

public class Compare2 {

    public static void main(String[] args) {

        String str1 = "hello";
        String str2 = "world";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals(str2);
        boolean result3 = str2.equals("world");


        System.out.println(str1.equals(str2));
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
